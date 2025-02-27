package com.xworkz.app.dto;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer_details")
@NamedQueries({@NamedQuery(name = "getcustomerNameById",query = "select customer.customerName from CustomerDto  customer where customer.id = :i"),
        @NamedQuery(name = "getemailById",query = "select customer.customerName from CustomerDto  customer where customer.id = :i"),
        @NamedQuery(name = "getcustomerNoById",query = "select customer.customerNo from CustomerDto  customer where customer.id = :i"),
        @NamedQuery(name = "getCustomerNameAndemailById",query = "select customer.customerName,customer.Email from CustomerDto customer where customer.id = :id"),
        @NamedQuery(name = "getcustomerNoAndnameById",query = "select customer.customerNo,customer.customerName from CustomerDto customer where customer.id = :id")})
public class CustomerDto {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name = "customer_id")
    private  int id;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_email")
    private String Email;
    @Column(name = "customer_number")
    private  int customerNo;
}
