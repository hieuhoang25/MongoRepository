package com.hicode.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("groceryitems")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class GroceryItem {
    @Id
    private String id;
    
    private String name;
    private int quantity;
    private String category;

}
