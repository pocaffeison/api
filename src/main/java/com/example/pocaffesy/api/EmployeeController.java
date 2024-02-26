package com.example.pocaffesy.api;

public class EmployeeController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee get(long id) {
        return employeeRepository.getEmployee(id);
    }
}
