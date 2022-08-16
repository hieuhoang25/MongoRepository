package com.hicode.mongodb.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Update;

import com.hicode.mongodb.model.Student;

public interface StudentRepository extends MongoRepository<Student,String> {
    // Queries from MethodNames;
    Optional<Student> findStudentByEmail(String email);
    //Ngon DSL
    // List<Student> findByTotalSpentInBooks(BigDecimal amount);
    
    
    
    
}
