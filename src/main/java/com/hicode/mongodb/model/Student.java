package com.hicode.mongodb.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document("students")
@Data
@NoArgsConstructor
@Getter
@Setter

public class Student {
    @Id
    private  String id;
    private  String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    // @Field
    private List<String> favouriteSubject;
    private BigDecimal totalSpentInBooks;
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    private LocalDateTime created;
    public Student(String firstName, String lastName, String email, Gender gender, Address address,
            List<String> favouriteSubject, BigDecimal totalSpentInBooks, LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favouriteSubject = favouriteSubject;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }



}
