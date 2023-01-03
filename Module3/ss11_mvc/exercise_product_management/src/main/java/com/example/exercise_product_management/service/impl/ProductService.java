package com.example.exercise_product_management.service.impl;

import com.example.exercise_product_management.model.Product;
import com.example.exercise_product_management.service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//private int id;
//private String name;
//private double price;
//private String description;
//private String brand;
public class ProductService implements IProductService {
    private static Map<Integer, Product> map = new HashMap<>();

    static {
        map.put(1, new Product(1, "IphoneX", 2000, "new 2020", "Apple"));
        map.put(2, new Product(2, "Note4", 2500, "new 2021", "Samsung"));
        map.put(3, new Product(3, "Iphone11", 2800, "new 2021", "Apple"));
        map.put(4, new Product(4, "Nokia7", 1800, "old 2022", "Nokia"));
        map.put(5, new Product(5, "Iphone14ProMax", 3000, "brand-new 2022", "Apple"));
    }

    @Override
    public List<Product> findAllProducts() {
        return new ArrayList<>(map.values());
    }

    @Override
    public void saveProduct(Product product) {
        map.put(product.getId(), product);
    }

    @Override
    public Product findProductById(int id) {
        return map.get(id);
    }

    @Override
    public void updateProduct(int id, Product product) {
        map.put(id, product);
    }

    @Override
    public void deleteProduct(int id) {
        map.remove(id);
    }


    @Override
    public List<Product> findProductByName(String name) {
        List<Product> list = new ArrayList<>(map.values());
        List<Product> newList = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                index = i;
                newList.add(list.get(i));
            }
        }
        if (index == -1) {
            return null;
        }
        return newList;
    }
}
