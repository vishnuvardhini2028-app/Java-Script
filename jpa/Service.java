package com.example.ordermanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service 
{
    @Autowired
    Repo repo;

    public String addorder(Order order)
    {
       repo.save(order);
       return "inserted sucessfully";
    }
    public String findallorders() 
    {
        repo.findAll();
        return "finding all the orders";
    }
    public String updatOrder(Integer id,Order order)
    {
        order.setId(id);
        repo.save(order);
        return "updated sucessfully"; 
    }
    public String deleteorder(Integer id)
    {
        repo.deleteById(id);
        return "deleted sucessfully";
    }
    public String searchByCustomerName(String name)
    {
        repo.findByCustomerName(name);
        return "found customer name";
    }

}
