package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IProductRepository {
    List<Product> findAll();

    void create(Product product);

    void update(int id, Product product);

    void remove(int id);

    Product findById(int id);

    List<Product> searchByName(String nameSearch);
}
