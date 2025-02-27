package com.xworkz.car.dao;

import com.xworkz.car.dto.CarDto;

import java.util.List;

public interface CarDao {

    boolean save(CarDto carDto);

    CarDto getUserById(int id);

    List<CarDto> getAllDetails(CarDto carDto);

    void updateUserById(int id, CarDto newUserData);

    boolean DeleteUserById(int id);

    String getCarNameById(int id);

    String getmodelById(int id);

    Object[] getCarNameAndModelById(int id);

    Object[] getModelpriceAndCarNameById(int id);

    double getpriceById(double id);

}
