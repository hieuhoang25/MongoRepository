package com.hicode.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hicode.mongodb.model.Person;


public interface PersonRepository extends MongoRepository<Person, String> {
    
}
