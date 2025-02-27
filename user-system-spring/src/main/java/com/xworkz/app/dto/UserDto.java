package com.xworkz.app.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "user_tables")
@NamedQueries({@NamedQuery(name = "getEmailById",query = "select user.Email from UserDto  user where user.id = :i"),
      @NamedQuery(name  ="getuserNameAndphNoById",query = "select user.userName,user.phNo from UserDto user where user.id =:i")})
@NamedQuery(name = "fetchUserNameAndAgeByAdhaarNo",query = "select user.userName,user.age from UserDto user where user.AddharNo = :aNo")
public class UserDto {
    @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
  @Column(name = "id")
    private  int id;
   @Column(name = "userName")
    private String userName;
   @Column(name = "Email")
    private String Email;
   @Column(name = "phNo")
    private  int phNo;
    @Column(name = "age")
   private String age;
    @Column(name = "AddharNo")
   private long AddharNo;
    @Column(name = "Address")
   private String address;
}
