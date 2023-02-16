package com.example.blog.service;

import com.example.blog.model.Category;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();

    void save(Category category);

    Optional<Category> findById(int id);

    void remove (int id);
}
