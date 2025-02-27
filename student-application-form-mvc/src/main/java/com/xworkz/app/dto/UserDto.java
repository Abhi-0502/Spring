package com.xworkz.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "register")
@NamedQueries({
@NamedQuery(name = "getAllUsers",query = "from UserDto dto"),
@NamedQuery(name = "deleteById",query = "delete UserDto dto where dto.id =: userid")
})
public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "dob")
    private String dob;
    @Column(name = "gender")
    private String gender;
    @Column(name = "phone_number")
    private long phone;
    @Column(name = "address")
    private String address;
}
