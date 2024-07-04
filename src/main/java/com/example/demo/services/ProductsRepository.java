package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}

