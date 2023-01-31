package com.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DictionaryController {
    static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("orange", "Cam");
        dictionary.put("yellow", "Vàng");
        dictionary.put("red", "Đỏ");
        dictionary.put("purple", "Tím");
    }
    @GetMapping("/dictionary")
    public String showForm(){
        return "dictionary";
    }
    @GetMapping("/result")
    public String searchWord(@RequestParam String word, Model model) {
        if (dictionary.get(word) != null) {
            model.addAttribute("meaning", dictionary.get(word));
        } else {
            model.addAttribute("meaning","Not found");
        }
        return "dictionary";
    }
}
