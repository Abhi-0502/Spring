package com.xworkz.app.dto;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "product_table")
@NamedQueries({@NamedQuery(name = "getUserNameById",query = "select user.productName from ProductDto  user where user.id = :i"),
        @NamedQuery(name = "getUserNameAndcategoryById",query = "select user.productName,user.category from ProductDto user where user.id =:i"),
        @NamedQuery(name = "getcategoryAndproductNoById",query = "select user.category,user.productNo from ProductDto user where user.id =:i"),
        @NamedQuery(name = "getproductNoById",query = "select user.productNo from ProductDto  user where user.id = :i"),
        @NamedQuery(name = "getCategoryById",query = "select user.category from ProductDto  user where user.id = :i")})
public class ProductDto {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name = "id")
    private  int id;
    @Column(name = "productName")
    private String productName;
    @Column(name = "category")
    private String category;
    @Column(name = "productNo")
    private  int productNo;
}
