package com.xwork.newyear.dto;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Data
@Entity
@NoArgsConstructor
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;


    @NotNull(message = "First Name should not be null")
    @Size(min = 3, max = 20, message = "First Name should be between 3 and 20 characters")
    private String firstName;

    @NotNull(message = "Last Name should not be null")
    @Size(min = 2, max = 20, message = "Last Name should be between 3 and 20 characters")
    private String lastName;

    @NotNull(message = "Email should not be null")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Alternate Email should not be null")
    @Email(message = "Invalid alternate email format")
    private String alterEmail;

    @NotNull(message = "Contact should not be null")
    @Digits(integer = 10, fraction = 0, message = "Contact must be a 10-digit number")
    private Long contact;

    @NotNull(message = "Alternative Contact should not be null")
    @Digits(integer = 10, fraction = 0, message = "Alternative Contact must be a 10-digit number")
    private Long alternativeContact;

    @NotNull(message = "Date of Birth should not be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @NotNull(message = "Place should not be null")
    @Size(min = 3, max = 50, message = "Place should be between 3 and 50 characters")
    private String place;

    @NotNull(message = "State should not be null")
    @Size(min = 3, max = 50, message = "State should be between 3 and 50 characters")
    private String state;

    @NotNull(message = "District should not be null")
    @Size(min = 3, max = 50, message = "District should be between 3 and 50 characters")
    private String District;

    @NotNull(message = "Password should not be null")
    @Size(min = 3, max = 50, message = "Password should be between 3 and 50 characters")
    private String password;

    @NotNull(message = "Confirm Password should not be null")
    @Size(min = 3, max = 50, message = "Confirm Password should be between 3 and 50 characters")
    private String confirmPwd;

    private String createdBy;
    private LocalDate createDate;
    private String updateBy;
    private LocalDate updatedDate;


}
