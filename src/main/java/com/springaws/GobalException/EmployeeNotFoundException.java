package com.springaws.GobalException;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) { super("Could not find id " + id); } }
