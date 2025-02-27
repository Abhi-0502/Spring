package com.xworkz.registration.constant;

import lombok.Getter;

@Getter
public enum ServiceConstant {
    FILE_PATH("C:\\New year image(project)/"),
    FROM_EMAIL("meghajaanu75@gmail.com"),FROM_NAME("Meghana"),password("psuh udsg yquh gxpv");

    private String path;

    private ServiceConstant(String path){
        this.path=path;
    }
}
