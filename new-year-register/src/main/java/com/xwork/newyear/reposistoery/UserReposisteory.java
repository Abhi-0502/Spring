package com.xwork.newyear.reposistoery;

import com.xwork.newyear.entity.UserEntity;

public interface UserReposisteory {

    boolean Save(UserEntity userEntity);
    UserEntity findByEmail(String email);
    boolean updatePassword(String email,String password, String confirmPwd);
}
