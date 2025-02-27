package com.xworkz.mall.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "mall_details")
@NamedQueries({@NamedQuery(name = "DeleteUserById",query = "delete from MallDto dto where dto.id =: id"),
        @NamedQuery(name = "getmallNameById",query = "select mall.mallName from MallDto  mall where mall.id = :i"),
        @NamedQuery(name ="getmallAreaById",query = "select mall.mallArea from MallDto  mall where mall.id = :i"),
        @NamedQuery(name = "getCityById",query = "select mall.city from MallDto  mall where mall.id = :i"),
        @NamedQuery(name = "getmallnameAndCityById",query = "select mall.mallName,mall.city from MallDto mall where mall.id = :id"),
        @NamedQuery(name = "getmallareaAndnoOfFloorById",query = "select mall.mallArea,mall.noOfFloors from MallDto mall where mall.id = :id")})
public class MallDto {

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name = "mall_id")
    private int id;
    @Column(name = "mall_name")
    private String mallName;
    @Column(name = "mall_area")
    private String mallArea;
    @Column(name = "mall_noOfFloors")
    private int noOfFloors;
    @Column(name = "mall_city")
    private String city;
}
