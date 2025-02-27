package com.xworkz.newyear.constant;

import lombok.Getter;

@Getter
public enum ServicesConstant {

    FROM_EMAIL("aabhilashahr2002@gmail.com"),FROM_NAME("ABHI"), password("czxo luhy hwtx ssgq");

    private String path;

    private ServicesConstant(String path) {
        this.path = path;
    }
}