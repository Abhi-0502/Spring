package com.xworkz.registration.service;

import com.xworkz.registration.constant.ServiceConstant;
import com.xworkz.registration.dto.UserDto;
import com.xworkz.registration.entity.UserEntity;
import com.xworkz.registration.repository.UserRepositoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryImpl repository;
    @Autowired
    private MessageOtp messageOtp;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean validateAndSave(UserDto userDto) {
        if(repository.checkEmail(userDto.getEmail()) && repository.checkContact(userDto.getContact())){
            return false;
        }else {
            log.info("Validate and save method in service impl");
            UserEntity userEntity = new UserEntity();
            boolean isadded = false;

            if (userDto != null) {
                BeanUtils.copyProperties(userDto, userEntity);
                userEntity.setCreatedBy(userDto.getFirstName());
                userEntity.setCreatedDate(LocalDate.now());
                userEntity.setProfilePhoto("blank.png");
                userEntity.setFileType("png/jpg");
                userEntity.setPassword(passwordEncoder.encode(userDto.getPassword()));
                isadded = repository.save(userEntity);
                log.info("First registration user details saved: {}", isadded);
                if (isadded) {
                    log.info("Sending registration email to: {}", userDto.getEmail());
                    try {
                        messageOtp.sendRegistrationMessage("Registration", "Thank You For Registering "+userDto.getFirstName(), userDto.getEmail());
                        log.info("Email sent successfully to: {}", userDto.getEmail());
                    } catch (Exception e) {
                        log.error("Failed to send email. Error: {}", e.getMessage());
                    }
                }
            }
            return isadded;
        }
    }
    @Override
    public UserDto validateAndSignIn(String email, String password) {
        log.info("Validation method in service impl");
        UserDto userDto = new UserDto();
        UserEntity userEntity = repository.findByEmailAndPassword(email, password);
        if (userEntity != null && userEntity.getEmail() != null && userEntity.getPassword() != null
                && userEntity.getEmail().equalsIgnoreCase(email) && userEntity.getPassword().equals(password)) {
            BeanUtils.copyProperties(userEntity, userDto);
            return userDto;
        } else {
            return userDto;
        }
    }
    @Override
    public UserDto findById(int id) {
        log.info("update service started");
        UserDto userDto = new UserDto();
        UserEntity userEntity = repository.findById(id);
        BeanUtils.copyProperties(userEntity,userDto);
        return userDto;
    }

    @Override
    public UserDto updateProfileData(UserDto userDto, UserDto sessionDto, MultipartFile multipartFile) {
log.info("Updation method in service impl");
        if(multipartFile.isEmpty()){
            log.info("File is empty");
        }else{
            try {
                byte[] bytes = multipartFile.getBytes();
                Path path = Paths.get(ServiceConstant.FILE_PATH.getPath()+multipartFile.getOriginalFilename());
                Files.write(path,bytes);
            } catch (IOException e) {
                log.info("{}",e.getMessage());
            }
        }
        //UserEntity user = repository.findById(userDto.getId());
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);

        userEntity.setPassword(sessionDto.getPassword());
        userEntity.setConfirmPassword(sessionDto.getPassword());
        userEntity.setCreatedBy(sessionDto.getFirstName());
        userEntity.setCreatedDate(LocalDate.now());
        userEntity.setUpdatedByy(sessionDto.getEmail());
        userEntity.setUpdatedDate(LocalDate.now());
        userEntity.setProfilePhoto(multipartFile.getOriginalFilename());
        userEntity.setFileType(multipartFile.getContentType());
if(multipartFile.isEmpty()){
    userEntity.getProfilePhoto();
}
        UserEntity entity = repository.updateProfileData(userEntity);
        UserDto dto = new UserDto();
        BeanUtils.copyProperties(entity,dto);
        return dto;
    }

    @Override
    public boolean updatePasswordByEmail(String email, String newPassword, String confirmPassword) {
        boolean isPasswordUpdated = false;
        return repository.updatePassword(email, newPassword, confirmPassword);
    }

    public boolean emailExists(String email, String password) {
        return repository.findByEmailAndPassword(email, password) != null;
    }
}
