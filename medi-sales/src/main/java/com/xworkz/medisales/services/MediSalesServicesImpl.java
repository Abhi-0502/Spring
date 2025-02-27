package com.xworkz.medisales.services;

import com.xworkz.medisales.dto.MediSalesDto;
import com.xworkz.medisales.entity.MediSalesEntity;
import com.xworkz.medisales.repository.MediSalesDaoImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MediSalesServicesImpl implements MediSalesServices{

    @Autowired
    private MediSalesDaoImpl mediSalesDao;

    @Autowired
    private MailService mailServices;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean validateAndSignIn(MediSalesDto mediSalesDto) {
        if (mediSalesDao.findByEmail(mediSalesDto.getEmail())) {
            return false;
        } else {
            MediSalesEntity userEntity = new MediSalesEntity();
            mediSalesDto.setPassword(passwordEncoder.encode(mediSalesDto.getPassword()));
            BeanUtils.copyProperties(mediSalesDto, userEntity);
            userEntity.setPassword(mediSalesDto.getContactPerson());
            if (mediSalesDao.Save(userEntity)) {
                log.info("ValidateAndSignIn is added Successfully");
               // mailServices.sendRegistrationMessage("Registration", "Thank You For Registering", mediSalesDto.getEmail());

            }
            return true;
        }
    }


//    @Override
//    public MediSalesDto signIn(String email, String password) {
//        MediSalesDto userDto =new MediSalesDto();
//        MediSalesEntity userEntity = mediSalesDao.findByEmailAnd(email);
//        log.info("Email: {} Password: {} ", userEntity.getEmail(), userEntity.getPassword());
//        log.info("email and password is match");
//        if (userEntity != null &&
//                userEntity.getEmail() != null &&
//                userEntity.getEmail().equalsIgnoreCase(email) &&
//                userEntity.getPassword() != null &&
//                passwordEncoder.matches(password,userEntity.getPassword())) {
//            BeanUtils.copyProperties(userEntity,userDto);
//            return userDto;
//        } else {
//            log.info("User Email: {}", email);
//            MediSalesEntity entity = mediSalesDao.checkEmail(email);
//
//            entity.setAttempt(entity.getAttempt() +1);
//           // mediSalesDao.updateDate(entity);
//            log.info("After update : {}", entity.getAttempt());
//            MediSalesDto userDto1 = new MediSalesDto();
//            userDto1.setAttempt(entity.getAttempt());
//            log.info("After setting the value : {}", userDto1.getAttempt());
//            return userDto1;
//        }
//    }

}
