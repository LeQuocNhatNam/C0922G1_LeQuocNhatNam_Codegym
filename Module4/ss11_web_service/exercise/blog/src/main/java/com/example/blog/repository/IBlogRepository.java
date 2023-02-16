package com.example.blog.repository;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findByNameContaining(String name, Pageable pageable);
    Page<Blog> findByCategoryContaining(int id,Pageable pageable);
    Page<Blog> findByCategory_Id(int id, Pageable pageable);
}
