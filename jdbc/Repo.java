package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Repo 
{
    public Connection getconnection() throws SQLException
    {
       return DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC",
       "postgres","vishnu");
    }
    public String addbook(Library lib) throws SQLException
    {

     Connection con = getconnection();
     PreparedStatement ps=con.prepareStatement("insert into books(id,title,author) values(?,?,?) ");
     ps.setInt(1,lib.getId() );
     ps.setString(2,lib.getTitle());
     ps.setString(3, lib.getAuthor());
     int row=ps.executeUpdate();

    ps.close();
    con.close();
     if(row>0)
     {
        return"inserted sucessfully";
     }
     else
    {
        return"Error while inserting data";
     }
     
    } 
    public List<Library> viewbooks() throws SQLException 
    {
       List<Library> list=new ArrayList<>();
       Connection con = getconnection();
        PreparedStatement ps = con.prepareStatement("select * from books");
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            Library lib=new Library();
            lib.setId(rs.getInt("id"));
            lib.setTitle(rs.getString("title"));
            lib.setAuthor(rs.getString("author"));
            list.add(lib);
        
    } 
    return list;
}
}