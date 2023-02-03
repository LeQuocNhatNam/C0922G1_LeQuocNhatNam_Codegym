package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static final Map<Integer,Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"iPhone",2000,"All-new","Apple"));
        productMap.put(2,new Product(2,"iPhone1",2000,"All-new","Apple"));
        productMap.put(3,new Product(3,"iPhone2",2000,"All-new","Apple"));
        productMap.put(4,new Product(4,"iPhone3",2000,"All-new","Apple"));
        productMap.put(5,new Product(5,"iPhone4",2000,"All-new","Apple"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void create(Product product) {
        productMap.put(product.getId(),product);
    }


    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> searchByName(String nameSearch) {
        List<Product> list = new ArrayList<>(productMap.values());
        List<Product> searchList = new ArrayList<>();
        for (Product product:list){
            if (product.getName().contains(nameSearch)){
                searchList.add(product);
            }
        }
        return searchList;
    }
}
