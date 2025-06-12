package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    private Map<Integer, String> items = new HashMap<>();
    private int currentId = 1;

    @GetMapping("/{id}")
    public String getItem(@PathVariable int id) {
        return items.getOrDefault(id, "Item not found");
    }

    @PostMapping
    public String createItem(@RequestBody String value) {
        int id = currentId++;
        items.put(id, value);
        return "Item created with id: " + id;
    }

    @PutMapping("/{id}")
    public String updateItem(@PathVariable int id, @RequestBody String value) {
        if (items.containsKey(id)) {
            items.put(id, value);
            return "Item updated";
        } else {
            return "Item not found";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable int id) {
        if (items.containsKey(id)) {
            items.remove(id);
            return "Item deleted";
        } else {
            return "Item not found";
        }
    }
}