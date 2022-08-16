package com.hicode.mongodb.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("person")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    private String id;
    @DocumentReference
    private List<Account> acounts;
    private String name;

    public Person(List<Account> acounts) {
        this.acounts = acounts;
    }

}
