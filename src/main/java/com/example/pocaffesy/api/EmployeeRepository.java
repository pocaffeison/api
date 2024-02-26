package com.example.pocaffesy.api;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository { //Repo
    private Map<Long, Employee> context;

    EmployeeRepository() {
        context = new HashMap<>();
    }

    public Employee getEmployee(long id) {
        Assert.isNull(id, "Employee is not null");
        return context.get(id);
    }
}
