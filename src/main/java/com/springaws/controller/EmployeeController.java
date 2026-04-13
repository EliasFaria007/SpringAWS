package com.springaws.controller;

import com.springaws.GobalException.EmployeeNotFoundException;
import com.springaws.model.Employee;
import com.springaws.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class EmployeeController {
    private final EmployeeRepository repository;

    @GetMapping("/employees")
    public List<Employee> listOfEmployeeAll() {
        return repository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee consultEmployeeById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(()-> new EmployeeNotFoundException(id));
    }
}
