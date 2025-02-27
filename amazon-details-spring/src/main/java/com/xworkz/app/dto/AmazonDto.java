package com.xworkz.app.dto;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "amazon_table")
@NamedQuery(name = "getAllDetails",query = "select amazon From AmazonDto amazon")
@NamedQuery(name = "deleteProductId", query = "delete from AmazonDto amazon where amazon.id =: id")
public class AmazonDto implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_Name")
    private String productName;

    @Column(name = "product_Quality")
    private String productQuality;

    @Column(name = "product_price")
    private String productPrice;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_stock")
    private int productStock;

    @Column(name = "product_brand")
    private String productBrand;

    @Column(name = "product_weight")
    private double productWeight;
}
