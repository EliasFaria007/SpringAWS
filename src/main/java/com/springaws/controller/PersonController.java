package com.springaws.controller;

import com.springaws.model.Person;
import com.springaws.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class PersonController {
    private final PersonRepository repository;

    @GetMapping("/persons")
    public List<Person> consultAllPerson() {
        return repository.findAll();
    }

    @GetMapping("/persons/{id}")
    public List<Person> consultPersonById(@PathVariable long id) {
        return repository.findById(id).stream().toList();
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            repository.save(Person.builder().name("John").build());
            repository.save(Person.builder().name("Jane").build());
            repository.save(Person.builder().name("Doe").build());
        };
    }
}
