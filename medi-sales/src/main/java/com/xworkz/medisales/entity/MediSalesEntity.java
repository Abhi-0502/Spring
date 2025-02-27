package com.xworkz.medisales.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Data
@ToString
@Table(name = "medisales")
public class MediSalesEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userType;
    private String companyName;
    private String contactPerson;
    private String businessType;
    private String mobile;
    private String email;
    private String address1;
    private String address2;
    private String pincode;
    private String referral;
    private String password;
    private int attempt;

}
