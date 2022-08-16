package com.hicode.mongodb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hicode.mongodb.model.Person;
import com.hicode.mongodb.repository.PersonRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }
}
