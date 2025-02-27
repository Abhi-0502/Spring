package com.bhive.business.dto;

public class BusinessDto {


    private String name;
    private String industry;

    public BusinessDto(String name, String industry) {
        this.name = name;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    @Override
    public String toString() {
        return "ClientDTO{name='" + name + "', industry='" + industry + "'}";
    }
}
