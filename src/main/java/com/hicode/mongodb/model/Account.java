package com.hicode.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Account {
    
    @Id
    String id;
    Float total;
    public Account(Float total) {
        this.id = id;
        this.total = total;
    }
    
}
