package com.xworkz.newyear.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@ToString
@Table(name = "newyear_register")
@NamedQuery(name = "findByemail",query = "SELECT count(u) FROM UserEntity u WHERE u.email =:email")
@NamedQuery(name = "findByEmail", query = "SELECT u FROM UserEntity u WHERE u.email = :email")

@NamedQuery(name = "checkPhone",query = "SELECT count(u) FROM UserEntity u WHERE u.contact =:contact")
@NamedQuery(name = "updatePassword",
        query = "UPDATE UserEntity u SET u.password = :password, u.confirmPwd = :confirmPwd WHERE u.email = :email")
@NamedQuery(name = "findByEmailAndPassword",query = "SELECT u FROM UserEntity u WHERE u.email = :email AND u.password = :password")
@NamedQuery(name = "findByEmailAnd",query = "SELECT u FROM UserEntity u WHERE u.email = :email")
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String alterEmail;
    private Long contact;
    private Long alternativeContact;
    private String dob;
    private String place;
    private String state;
    private String district;
    private String password;
    private String confirmPwd;
    private String createdBy;
    private LocalDate createDate;
    private String updateBy;
    private LocalDate updatedDate;
    private int attempt;
    private String otp;




}
