package com.springaws.controller;

import com.springaws.GobalException.EmployeeNotFoundException;
import com.springaws.model.Employee;
import com.springaws.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class EmployeeController {
    private final EmployeeRepository repository;

    //Lista tudo da tabela Employee
    @GetMapping("/employees")
    public List<Employee> listOfEmployeeAll() {
        return repository.findAll();
    }

    //Condulta na tabela employee pelo ID
    @GetMapping("/employees/{id}")
    public Employee consultById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(()-> new EmployeeNotFoundException(id));
    }

    //Salva usuario na tabela Employee
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    //Deleta da tabela Employee pelo ID
    @DeleteMapping("employees/{id}")
    public void deleteEmployee(@PathVariable Long id){
        repository.deleteById(id);
    }

    //Update 
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setAddress(newEmployee.getAddress());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }
}
