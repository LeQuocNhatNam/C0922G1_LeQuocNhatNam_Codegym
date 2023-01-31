package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping ("/convert")
    public String showForm(){
        return "convert";
    }
    @PostMapping ("/convert")
    public String convert(@RequestParam double usd, Model model){
        double vnd = usd * 23;
        model.addAttribute("vnd",vnd);
        return "convert";
    }
}
