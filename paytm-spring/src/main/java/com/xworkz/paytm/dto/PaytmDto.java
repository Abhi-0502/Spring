package com.xworkz.paytm.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "PaymentDetailses")
@NamedQuery(name = "getAllUser",query = "select paytm From PaytmDto paytm")
@NamedQuery(name = "getDeleteById", query = "delete from PaytmDto paytm where paytm.id =: id")
public class PaytmDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  @GenericGenerator(name = "abhi",strategy = "increment")
    //@GeneratedValue(generator = "abhi")
    @Column(name = "id")
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "PhoneNo")
    private long  phoneNo;
    @Column(name = "TransactionId")
    private String transactionId;
    @Column(name = "PinCode")
    private int pinCode;
    @Column(name = "BankName")
    private  String bankName;
    @Column(name = "atmNo")
    private long atmNo;
    @Column(name = "amount")
    private int amount;
    @Column(name = "paymentStatus")
    private String paymentStatus;
    @Column(name = "paymentMode")
    private String paymentMode;
    @Column(name = "Remarks")
    private String Remarks;






}
