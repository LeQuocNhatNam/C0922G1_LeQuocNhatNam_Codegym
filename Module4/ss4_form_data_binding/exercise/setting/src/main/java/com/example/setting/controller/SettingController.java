package com.example.setting.controller;

import com.example.setting.model.Email;
import com.example.setting.model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/setting")
public class SettingController {
    static List<Email> emailList = new ArrayList<>();

    static {
        emailList.add(new Email(1, "nam@gmail.com", new Setting()));
        emailList.add(new Email(2, "nam2@gmail.com", new Setting()));
        emailList.add(new Email(3, "nam3@gmail.com", new Setting()));
    }

    @ModelAttribute("languages")
    public String[] showListLanguages() {
        String[] strings = {"English", "Vietnamese", "Japanese", "Chinese"};
        return strings;
    }

    @ModelAttribute("pageSizes")
    public int[] showPageSizes() {
        int[] strings = {5, 10, 15, 25, 50, 100};
        return strings;
    }

    @GetMapping("")
    public String showForm(@RequestParam int id, Model model) {
        model.addAttribute("id",id);
        model.addAttribute("emailList",emailList);
        Setting setting = null;
        for (Email email: emailList) {
            if (email.getId() == id) {
               setting = email.getSetting();
                break;
            }
        }
        model.addAttribute("setting", setting);
        return "edit";
    }

    @PostMapping("")
    public String set(@RequestParam int id, @ModelAttribute("setting") Setting setting, Model model, RedirectAttributes redirectAttributes) {
        for (Email email: emailList) {
            if (email.getId() == id) {
                email.setSetting(setting);
                break;
            }
        }
        return "redirect:/setting/list";
    }

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("emailList", emailList);
        return "list";
    }
}
