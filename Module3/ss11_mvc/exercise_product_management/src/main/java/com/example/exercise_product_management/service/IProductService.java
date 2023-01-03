package com.example.exercise_product_management.service;

import com.example.exercise_product_management.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAllProducts();

    void saveProduct(Product product);

    Product findProductById(int id);

    void updateProduct(int id, Product product);

    void deleteProduct(int id);

    List<Product> findProductByName(String name);




}
