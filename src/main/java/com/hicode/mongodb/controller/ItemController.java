package com.hicode.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hicode.mongodb.model.GroceryItem;
import com.hicode.mongodb.repository.ItemRepository;

@Controller
public class ItemController {
    @Autowired
    ItemRepository groceryItemRepo;
    
    @GetMapping("insert")
    @ResponseBody
    public String insert() {
        
        groceryItemRepo.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
        groceryItemRepo.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
        groceryItemRepo.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
        groceryItemRepo.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
        groceryItemRepo.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
    return "Success";
    }
    @GetMapping("find")
    @ResponseBody
    public List<GroceryItem> find(){
        return groceryItemRepo.findAll();
    }
}
