package com.xworkz.car.service;

import com.xworkz.car.dao.CarDao;
import com.xworkz.car.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;
    boolean isvalidated = false;

    @Override
    public boolean save(CarDto carDto) {
        if(carDto !=null){
            if(carDto.getName() != null && !carDto.getName().isEmpty()){
                System.out.println("Name validated");
                carDao.save(carDto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public CarDto getUserById(int id) {
        return carDao.getUserById(id);
    }
    @Override
    public List<CarDto> getAllDetails(CarDto carDto) {
        return carDao.getAllDetails(carDto);
    }

    @Override
    public void updateUserById(int id, CarDto newUserData) {
        carDao.updateUserById(id,newUserData);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return carDao.DeleteUserById(id);
    }

    @Override
    public String getCarNameById(int id) {
     String carName = null;
     if (id >0){
         carName = carDao.getCarNameById(id);
     }
     return carName;
    }

    @Override
    public String getmodelById(int id) {
        String model = null;
        if (id >0){
            model = carDao.getmodelById(id);
        }
        return model;
    }

    @Override
    public Object[] getCarNameAndModelById(int id) {
        Object object[] = null;
        if (id>0){
            object = carDao.getCarNameAndModelById(id);
        }
        return object;
    }

    @Override
    public Object[] getModelpriceAndCarNameById(int id) {
        Object object[] = null;
        if (id>0){
            object = carDao.getModelpriceAndCarNameById(id);
        }
        return object;
    }

    @Override
    public double getpriceById(double id) {
            return carDao.getpriceById(id);
        }
    }
