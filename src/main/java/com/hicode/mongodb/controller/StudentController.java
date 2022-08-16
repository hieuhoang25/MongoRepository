package com.hicode.mongodb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hicode.mongodb.model.Student;
import com.hicode.mongodb.service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
    
    private final StudentService studentService;
    @GetMapping
    public List<Student> fetchAllStudent(){
        return studentService.fetchAllStudent();
    }
    @GetMapping("student")
    public Student getStudent(){
        return studentService.getStudent().get();
    }
}
