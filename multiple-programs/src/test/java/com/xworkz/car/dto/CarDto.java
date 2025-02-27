package com.xworkz.car.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "car_details")
@NamedQueries({@NamedQuery(name = "DeleteUserById",query = "delete from CarDto dto where dto.id =: id"),
        @NamedQuery(name = "getCarNameById",query = "select car.name from CarDto  car where car.id = :i"),
        @NamedQuery(name = "getmodelById",query = "select car.model from CarDto  car where car.id = :i"),
        @NamedQuery(name = "getModelpriceAndCarNameById",query = "select car.model,car.price from CarDto car where car.id =:i"),
        @NamedQuery(name = "getCarNameAndModelById",query = "select car.name,car.model from CarDto car where car.id =:i")})
public class CarDto {

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name = "car_id")
    private int id;
    @Column(name = "car_name")
    private String name;
    @Column(name = "car_price")
    private double price;
    @Column(name = "car_model")
    private String model;

}
