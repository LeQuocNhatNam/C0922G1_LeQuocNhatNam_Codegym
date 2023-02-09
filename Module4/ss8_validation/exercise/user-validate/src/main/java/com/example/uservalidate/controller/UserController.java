package com.example.uservalidate.controller;

import com.example.uservalidate.dto.UserDTO;
import com.example.uservalidate.model.User;
import com.example.uservalidate.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/user")
    public String showForm(Model model) {
        model.addAttribute("userDTO", new UserDTO());
        return "/index";
    }

    @PostMapping("/user")
    public String create(@Validated @ModelAttribute UserDTO userDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("userDTO", userDTO);
            return "/index";
        }
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        userService.save(user);
        return "/result";
    }
}
