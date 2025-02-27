package com.xworkz.registration.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Table(name = "registrations")
@NamedQueries({
@NamedQuery(name = "findByEmailAndPassword",
query = "SELECT u FROM UserEntity u WHERE u.email = :email AND u.password = :password"),
@NamedQuery(name="updatePasswordByEmail",query = "UPDATE UserEntity SET password = :newPassword,confirmPassword=:confirmPassword WHERE email = :email"),
@NamedQuery(name = "emailVerify", query = "select count(a) from UserEntity a where a.email=:emailVerify"),
@NamedQuery(name = "findById",query = "select a from UserEntity a where a.id=:id"),
@NamedQuery(name = "numberVerify",query = "select count(num) from UserEntity num where num.contact=:number")
})

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String alternateEmail;
    private String password;
    private String confirmPassword;
    private Long contact;
    private Long alternateContact;
    private String dob;
    private String place;
    private String state;
    private String district;
    private String createdBy;
    private LocalDate createdDate;
    private String updatedByy;
    private LocalDate updatedDate;
    private  String profilePhoto;
    private String fileType;
}
