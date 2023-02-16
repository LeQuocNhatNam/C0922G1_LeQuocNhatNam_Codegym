package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
@CrossOrigin("*")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    //    @GetMapping("/list")
//    public String showList(Model model, @RequestParam(required = false, defaultValue = "") String nameSearch,
//                           @PageableDefault(size = 10, page = 0, sort = "dateCreated",direction = Sort.Direction.ASC) Pageable pageable) {
//        Page<Blog> blogPage = blogService.search(nameSearch, pageable);
//        model.addAttribute("blogPage", blogPage);
//        return "blog/list";
//    }
    @GetMapping("/list")
    public String showList(Model model, @RequestParam(required = false, defaultValue = "") String nameSearch,
                           @RequestParam(required = false, defaultValue = "0") int page,
                           @RequestParam(required = false,defaultValue = "") String sort
                           ) {
        model.addAttribute("nameSearch", nameSearch);
        Pageable pageable = null;
        if (sort.equals("sort")) {
            model.addAttribute("sort",sort);
            pageable = PageRequest.of(page, 3, Sort.by("dateCreated").ascending());
        } else {
            pageable = PageRequest.of(page,3);
        }
        Page<Blog> blogPage = blogService.search(nameSearch, pageable);
        model.addAttribute("blogPage", blogPage);
        model.addAttribute("categoryList",categoryService.findAll());
        return "blog/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        model.addAttribute("blog", new Blog());
        return "blog/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "added successfully");
        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String showEditForm(@RequestParam int id, Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        model.addAttribute("blog", blogService.findById(id).get());
        return "blog/edit";
    }

    @PostMapping("edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "edited successfully");
        return "redirect:/list";
    }

    @GetMapping("detail")
    public String showDetail(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id).get());
        return "blog/detail";
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        blogService.delete(id);
        redirectAttributes.addFlashAttribute("message", "deleted successfully");
        return "redirect:/list";
    }


}
