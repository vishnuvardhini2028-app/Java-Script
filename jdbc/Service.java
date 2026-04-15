package com.example.jdbc;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service 
{
    @Autowired
    Repo repo;
    public String addbook(Library lib) throws SQLException
    {
        return repo.addbook(lib);
    }
    public List<Library> viewbooks() throws SQLException
    {
       return repo.viewbooks();
    }
}
