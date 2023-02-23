package com.example.spring_boot.DAO;

import com.example.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeDaoInter {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
