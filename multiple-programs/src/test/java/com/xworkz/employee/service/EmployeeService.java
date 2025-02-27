package com.xworkz.employee.service;

import com.xworkz.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    boolean validandSave(EmployeeDto employeeDto);

    EmployeeDto getUserById(int id);

    List<EmployeeDto> getAllDetails(EmployeeDto employeeDto);

    void updateUserById(int id, EmployeeDto newUserData);

    boolean DeleteUserById(int id);

    String getEducationbyId(int id);

    String getEmployeNameById(int id);

    Object[] getEmployeNameAndEducationById(int id);

    Object[] getEducationAndNameById(int id);

    String getSalaryById(int id);


}
