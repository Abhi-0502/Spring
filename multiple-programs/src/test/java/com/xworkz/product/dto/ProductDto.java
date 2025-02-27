package com.xworkz.product.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "product_details")
public class ProductDto {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")
    @Column(name = "id")
    private  int id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "category")
    private String category;
    @Column(name = "product_price")
    private  double productPrice;
    @Column(name = "ratings")
    private double ratings;
}
