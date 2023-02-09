package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    Optional<Blog> findById(int id);

    Page<Blog> search(String name, Pageable pageable);

}
