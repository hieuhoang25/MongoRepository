package com.hicode.mongodb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hicode.mongodb.model.Account;
import com.hicode.mongodb.model.Person;
import com.hicode.mongodb.repository.AccountRepository;
import com.hicode.mongodb.repository.PersonRepository;
import com.hicode.mongodb.service.PersonService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("person/findall")
public class AppController {
    
   private final PersonService personService;

    @GetMapping
    public List<Person> add(){
        return personService.findAll();
    }
}
