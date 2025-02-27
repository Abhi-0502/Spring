package com.xworkz.newyear.reposisteory;

import com.xworkz.newyear.entity.UserEntity;

public interface UserReposisteory {


    boolean Save(UserEntity userEntity);
    boolean findByEmail(String email);
    boolean updatePassword(String email, String newPassword, String confirmPwd);
  UserEntity findByEmailAndPassword(String email, String password);
  UserEntity findByEmailAnd(String email);
    UserEntity checkEmail(String email);
    boolean updateDate(UserEntity userEntity);

    boolean checkPhone(Long contact);




}
