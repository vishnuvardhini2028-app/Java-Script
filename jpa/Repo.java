package com.example.ordermanagementsystem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Order, Integer> {

    List<Order> findByCustomerName(String customerName);
}