package com.xworkz.employee.dto;

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
@Table(name = "employee_details")
@NamedQueries({@NamedQuery(name = "getEducationbyId",query = "select employee.education from EmployeeDto  employee where employee.id = :i"),
        @NamedQuery(name = "getEmployeNameById",query = "select employee.name from EmployeeDto  employee where employee.id = :i"),
        @NamedQuery(name = "getSalaryById",query = "select employee.salary from EmployeeDto  employee where employee.id = :i"),
        @NamedQuery(name = "getEducationAndNameById",query = "select employee.education,employee.name from EmployeeDto employee where employee.id = :id"),
        @NamedQuery(name = "getEmployeNameAndEducationById",query = "select employee.name,employee.education from EmployeeDto employee where employee.id = :id")})
public class EmployeeDto {

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "education")
    private String education;
    @Column(name = "salary")
    private double salary;
}
