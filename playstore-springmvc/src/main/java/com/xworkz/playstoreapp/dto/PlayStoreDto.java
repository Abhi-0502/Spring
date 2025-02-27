package com.xworkz.playstoreapp.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "play")
@NamedQuery(name = "getAllUser",query = "select playstore from PlayStoreDto playstore")
@NamedQuery(name = "deleteUserById", query = "delete from PlayStoreDto playstore where playstore.id =: id")
public class PlayStoreDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "userName")
    private String userName;
    @Column(name = "surName")
    private String surName;
    @Column(name = "gender")
    private String gender;
    @Column(name="dob")
    private String dob;
    @Column(name = "email")
    private String email;
    @Column(name = "number")
    private Long  number;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "confirmPwd")
    private String confirmPwd;
    @Column(name = "hideAns")
    private String hideAns;
    @Column(name = "captcha")
    private String captcha;
}
