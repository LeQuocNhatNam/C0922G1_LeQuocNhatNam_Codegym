package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "blog/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
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
    public String showDetail(@RequestParam int id, Model model){
        model.addAttribute("blog",blogService.findById(id).get());
        return "blog/detail";
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes){
        blogService.delete(id);
        redirectAttributes.addFlashAttribute("message","deleted successfully");
        return "redirect:/list";
    }


}
