package com.example.jdbc;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class controller 
{
    @Autowired
    Service service;
  
    @GetMapping("/viewdata")
    public List<Library> getMethodName() throws SQLException 
    {
        return service.viewbooks();
    }
    @PostMapping("/insertdata")
    public String postMethodName(@RequestBody Library lib) throws SQLException {
        
        
        return service.addbook(lib);
    }
    
    
    
    
     
}
