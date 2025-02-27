package com.xworkz.customer.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer")
@NamedQueries({
@NamedQuery(name = "getAllUsers",query = "from CustomerDto dto"),
@NamedQuery(name = "deleteById",query = "delete CustomerDto dto where dto.id =:userid")
})
public class CustomerDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private  int id;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_email")
    private String Email;
    @Column(name = "customer_number")
    private  long customerNo;
    @Column(name = "delivery_date")
    private String deliveryDate;
    @Column(name = "address")
    private String address;
}
