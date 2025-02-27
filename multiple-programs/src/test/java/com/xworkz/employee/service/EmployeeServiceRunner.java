package com.xworkz.employee.service;


import com.xworkz.employee.dao.EmployeeDao;
import com.xworkz.employee.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeServiceRunner implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    boolean isvalidated = false;

    @Override
    public boolean validandSave(EmployeeDto employeeDto) {
        if(employeeDto !=null){
            if(employeeDto.getName() != null && !employeeDto.getName().isEmpty()){
                System.out.println("Name validated");
                employeeDao.save(employeeDto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public EmployeeDto getUserById(int id) {
        return employeeDao.getUserById(id);
    }

    @Override
    public List<EmployeeDto> getAllDetails(EmployeeDto employeeDto) {
        return employeeDao.getAllDetails(employeeDto);
    }

    @Override
    public void updateUserById(int id, EmployeeDto newUserData) {
        employeeDao.updateUserById(id,newUserData);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return employeeDao.DeleteUserById(id);
    }

    @Override
    public String getEducationbyId(int id) {
        return employeeDao.getEducationbyId(id);
    }

    @Override
    public String getEmployeNameById(int id) {
        return employeeDao.getEmployeNameById(id);
    }

    @Override
    public Object[] getEmployeNameAndEducationById(int id) {
        Object object[] = null;
        if (id>0){
            object = employeeDao.getEmployeNameAndEducationById(id);
        }
        return object;
    }

    @Override
    public Object[] getEducationAndNameById(int id) {
        Object object[] = null;
        if (id>0){
            object = employeeDao.getEducationAndNameById(id);
        }
        return object;
    }

    @Override
    public String getSalaryById(int id) {
        return employeeDao.getSalaryById(id);
    }
}
