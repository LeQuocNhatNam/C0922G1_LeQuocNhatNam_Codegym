package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void create(Product product);

    void update(int id, Product product);

    void remove(int id);

    Product findById(int id);

    List<Product> searchByName(String nameSearch);
}
