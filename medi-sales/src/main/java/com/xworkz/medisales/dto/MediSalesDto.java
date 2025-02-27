package com.xworkz.medisales.dto;


import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.*;


@Getter
@Setter
@Data
@ToString
@Entity
@NoArgsConstructor

public class MediSalesDto {


    private  int id;

    @NotNull(message = "User type is required")
    private String userType;

    @NotNull(message = "Company name is required")
    private String companyName;

    @NotNull(message = "Contact person is required")
    private String contactPerson;

    @NotNull(message = "Business type is required")
    private String businessType;

    @NotNull(message = "Registered mobile is required")
    @Size(min = 10, max = 10, message = "Mobile number must be 10 digits")
    private String mobile;

    @NotNull(message = "Registered email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Address 1 is required")
    private String address1;

    private String address2;

    @NotNull(message = "Pincode is required")
    @Size(min = 6, max = 6, message = "Pincode must be 6 digits")
    private String pincode;

    private String referral;

    @NotNull(message = "Password is required")
    private String password;

    @NotNull(message = "Confirm password is required")
    private String confirmPassword;

    private int attempt;

}




