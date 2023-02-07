package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    //    private static final Map<Integer,Product> productMap;
//    static {
//        productMap = new HashMap<>();
//        productMap.put(1,new Product(1,"iPhone",2000,"All-new","Apple"));
//        productMap.put(2,new Product(2,"iPhone1",2000,"All-new","Apple"));
//        productMap.put(3,new Product(3,"iPhone2",2000,"All-new","Apple"));
//        productMap.put(4,new Product(4,"iPhone3",2000,"All-new","Apple"));
//        productMap.put(5,new Product(5,"iPhone4",2000,"All-new","Apple"));
//    }
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Product> findAll() {
        List<Product> productList = null;
        productList = entityManager.createQuery("select p from Product as p").getResultList();
        return productList;
    }

    @Transactional
    @Override
    public void update(int id, Product product) {
        Product product1 = findById(id);
        product1.setName(product.getName());
        product1.setBrand(product.getBrand());
        product1.setDescription(product.getDescription());
        product1.setId(id);
        entityManager.merge(product1);

    }

    @Transactional
    @Override
    public void create(Product product) {
        entityManager.persist(product);
    }

    @Transactional
    @Override
    public void remove(int id) {
        Product product1 = findById(id);
        entityManager.remove(product1);
    }

    @Transactional
    @Override
    public Product findById(int id) {
//        List<Product> productList = entityManager.createQuery("select p from Product as p").getResultList();
//        for (Product p : productList) {
//            if (p.getId() == id) {
//                return p;
//            }
//        }
        return entityManager.find(Product.class,id);
    }

    @Override
    public List<Product> searchByName(String nameSearch) {
//        List<Product> list = entityManager.createQuery("select p from Product as p ").getResultList();
//        List<Product> searchList = new ArrayList<>();
//        for (Product product : list) {
//            if (product.getName().contains(nameSearch)) {
//                searchList.add(product);
//            }
//        }
        List<Product> searchList = entityManager.createQuery("select p from Product as p where p.name like :nameSearch")
                .setParameter("nameSearch", "%" + nameSearch + "%").getResultList();
        return searchList;
    }
}
