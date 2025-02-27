package com.xwork.newyear.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@ToString
@Table(name = "newyear_registers")
@NamedQueries({@NamedQuery(name = "UserEntity.findByEmail",query = "SELECT u FROM UserEntity u WHERE u.email =: email"),
        @NamedQuery(name = "updatePassword",
                query = "UPDATE UserEntity u SET u.password = :password, u.confirmPwd = :confirmPwd WHERE u.email = :email")
})


public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String alterEmail;
    private long contact;
    private long alternativeContact;
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

}
