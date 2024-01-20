package com.miniproj.services;


import com.miniproj.entity.*;
import java.util.List;

public interface EmpService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void saveEmployee(Employee employee);

    void deleteEmployee(Long id);
}
