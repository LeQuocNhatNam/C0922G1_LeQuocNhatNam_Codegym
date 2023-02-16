package com.example.blog.controller.category;

import com.example.blog.model.Category;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/category")
public class CategoryRestController {
    @Autowired
    private ICategoryService service;

    @GetMapping("")
    public ResponseEntity<List<Category>> showList(){
        List<Category> categoryList = service.findAll();
        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }
}
