package com.xworkz.app.service;


import com.xworkz.app.EmailNotFoundException;
import com.xworkz.app.dao.UserDao;
import com.xworkz.app.dao.UserDaoImpl;
import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
        this.userDao = new UserDaoImpl(); // Ensure this is initialized
    }

    @Override
    public boolean validateAndSave(UserDto userDto) {

        boolean userValid = false;
        boolean isUserNameValid = false;
        if(userDto != null){
        if(userDto.getUserName() != null  && !userDto.getUserName().isEmpty()){
            isUserNameValid = true;
        }
        if(isUserNameValid){
            userValid = userDao.save(userDto);
        }
        }
        return userValid;
    }

    @Override
    public void UpdateUser(UserDto userDto) {
        if (userDto!= null){
            System.out.println("update details added");
        }
        userDao.UpdateUser(userDto);

    }

    @Override
    public boolean deleteUserById(int id) {
        if (id > 0){
            System.out.println("deleteUser by id");
        }
        return userDao.deleteUserById(id);
    }

    @Override
    public UserDto getUserbyId(int id) {
        if (id > 0){
            System.out.println("get user by id added");
        }
        return userDao.getUserbyId(id);
    }

    @Override
    public UserDto getUserName(String userName) {
        if (userName != null && !userName.isEmpty()){
            System.out.println("UserName is added");
        }
        return userDao.getUserName(userName);
    }

    @Override
    public String getEmailById(int id) {
        String email = null;
        if(id > 0){
            email= userDao.getEmailById(id);
        }
        return email;
    }

    @Override
    public Object[] getuserNameAndphNoById(int id) {
        Object object[] = null;
        if (id>0){
            object = userDao.getuserNameAndphNoById(id);
        }
        return object;
    }

    @Override
    public Object[] fetchUserNameAndAgeByAdhaarNo(long adharNo) {

        String convertAdhar = String.valueOf(adharNo);
        if (convertAdhar.length() != 12){
            throw new EmailNotFoundException("Invalid adhar number.it must be 12 digits long.");
        }
        Object[] adhar = userDao.fetchUserNameAndAgeByAdhaarNo(adharNo);
        if (adhar == null || adhar.length == 0){
            throw new EmailNotFoundException("No user found with the given adhar number: "+ adharNo);
        }

            return adhar;

    }

    @Override
    public String getEmailByAdharNo(long adharNo) {
        String email = null;
        if(adharNo > 0){
            email= userDao.getEmailByAdharNo(adharNo);
        }
        return email;
    }

    @Override
    public boolean updateAddressByAdharNo(String address, long adharNo) {
        boolean isAddressUpdated = false;
        String convertedAdharNo = String.valueOf(adharNo);
        if (address != null && !address.isEmpty() && convertedAdharNo.length()==12){
            isAddressUpdated = userDao.updateAddressByAdharNo(address,adharNo);
        }
        return isAddressUpdated;
    }

    @Override
    public boolean deleteUserByAdharNo(long adhar) {
        boolean isUserDeleted = false;
        String convertedAdharNo = String.valueOf(adhar);
        if (convertedAdharNo.length()==12){
            isUserDeleted = userDao.deleteUserByAdharNo(adhar);
        }

        return isUserDeleted;
    }
}

