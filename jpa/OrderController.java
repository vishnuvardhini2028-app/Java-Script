package com.example.ordermanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController 
{

    @Autowired
    private Service service;

    @PostMapping
    public String create(@RequestBody Order order) {
        return service.addorder(order);
    }

    @GetMapping
    public String getAll() {
        return service.findallorders();
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Integer id, @RequestBody Order order) {
        return service.updatOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteorder(id);
    }

    @GetMapping("/search")
    public String search(@RequestParam String name) {
        return service.searchByCustomerName(name);
    }
}
