package com.xworkz.registration.dto;

import lombok.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@ToString
public class UserDto {
    private Integer id;

    @NotNull(message = "First name should not be null")
    @Size(min = 3, max = 20, message = "First name should have a minimum of 3 and a maximum of 20 characters")
    private String firstName;

    @NotNull(message = "Last name should not be null")
    @Size(min = 3, max = 20, message = "Last name should have a minimum of 3 and a maximum of 20 characters")
    private String lastName;

    @NotNull(message = "Email should not be null")
    @Email(message = "Email format is invalid")
    private String email;

    @Email(message = "Alternate email format is invalid")
    private String alternateEmail;

    @NotNull(message = "Password should not be null")
    @Size(min = 6, max = 20, message = "Password should have a minimum of 6 and a maximum of 20 characters")
    private String password;

    @NotNull(message = "Confirm password should not be null")
    @Size(min = 6, max = 20, message = "Confirm password should have a minimum of 6 and a maximum of 20 characters")
    private String confirmPassword;

    @NotNull(message = "Contact should not be null")
    @Digits(integer = 10, fraction = 0, message = "Contact number must be a valid 10-digit number")
    private Long contact;

    @Digits(integer = 10, fraction = 0, message = "Alternate contact must be a valid 10-digit number")
    private Long alternateContact;

    @NotNull(message = "Date of birth should not be null")
    private String dob;

    @NotNull(message = "Place should not be null")
    @Size(min = 3, max = 50, message = "Place should have a minimum of 3 and a maximum of 50 characters")
    private String place;

    @NotNull(message = "State should not be null")
    @Size(min = 2, max = 50, message = "State should have a minimum of 2 and a maximum of 50 characters")
    private String state;

    @NotNull(message = "District should not be null")
    @Size(min = 2, max = 50, message = "District should have a minimum of 2 and a maximum of 50 characters")
    private String district;

    private String createdBy;
    private LocalDate createdDate;
    private String updatedBy;
    private LocalDate updatedDate;
    private  String profilePhoto;
    private String fileType;
}
