package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    Optional<Blog> findById(int id);
}
