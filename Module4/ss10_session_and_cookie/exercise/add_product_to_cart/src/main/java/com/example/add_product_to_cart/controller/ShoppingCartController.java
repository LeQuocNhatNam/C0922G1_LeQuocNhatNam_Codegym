package com.example.add_product_to_cart.controller;

import com.example.add_product_to_cart.dto.CartDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoppingCartController {
    @GetMapping("/shopping-cart")
    public ModelAndView showCart(@SessionAttribute(value = "cart",required = false) CartDTO cartDTO){
        ModelAndView modelAndView = new ModelAndView("/cart");
        modelAndView.addObject("cart",cartDTO);
        return modelAndView;
    }
}
