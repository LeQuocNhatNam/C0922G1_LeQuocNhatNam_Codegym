package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @GetMapping("")
    public String showList(){
        return "sandwich";
    }
    @GetMapping("/chosen")
    public String showCondiments(@RequestParam String[] condiment, Model model){
        model.addAttribute("condiments",condiment);
        return "details";
    }
}
