package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class BlogRestController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("blog")
    public ResponseEntity<Page<Blog>> getAll(@RequestParam(required = false, defaultValue = "") String name,
                                             @RequestParam(required = false, defaultValue = "0") int page,
                                             @RequestParam int pageSize) {
        Pageable pageable = PageRequest.of(page,pageSize);
        Page<Blog> blogPage = blogService.search(name, pageable);
        if (blogPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(blogPage,HttpStatus.OK);
        }
    }
//
//    @GetMapping("/searchByCategory")
//    public ResponseEntity<Page<Blog>> searchByCategory(@RequestParam(required = false,defaultValue = "0") int id,
//                                                       @RequestParam(required = false,defaultValue = "0") int page){
//        Pageable pageable = PageRequest.of(page,2);
//        Page<Blog> blogPage = blogService.searchByCategory(id,pageable);
//        if (blogPage.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(blogPage,HttpStatus.OK);
//    }
//
//    @GetMapping("/detail")
//    public ResponseEntity<Blog> getDetail(@RequestParam(required = false,defaultValue = "0") int id){
//        if (!blogService.findById(id).isPresent()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        Blog blog = blogService.findById(id).get();
//        return new ResponseEntity<>(blog,HttpStatus.OK);
//    }

}
