package com.hicode.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hicode.mongodb.model.Student;
import com.hicode.mongodb.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    public List<Student> fetchAllStudent() {
        return studentRepository.findAll();
    }
    public Optional<Student> getStudent(){
        return studentRepository.findById("62f90946e9d1cb66fd4b01be");
    }
}
