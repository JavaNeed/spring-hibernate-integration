package com.howtodoinjava.service;

import java.util.List;

import com.howtodoinjava.entity.EmployeeEntity;

public interface EmployeeService {
	public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
}
