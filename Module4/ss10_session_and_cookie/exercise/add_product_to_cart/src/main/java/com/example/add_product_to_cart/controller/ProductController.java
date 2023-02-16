package com.example.add_product_to_cart.controller;

import com.example.add_product_to_cart.dto.CartDTO;
import com.example.add_product_to_cart.model.Product;
import com.example.add_product_to_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.ParameterizedType;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public CartDTO setUpCart() {
        return new CartDTO();
    }

    @GetMapping("/shop")
    public ModelAndView shopNow(@CookieValue(value = "id", required = false, defaultValue = "-1") Long id) {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        Optional<Product> viewedProductOptional = productService.findById(id);
        if (!viewedProductOptional.isPresent()) {
            modelAndView.addObject("viewedProduct", null);
        } else {
            modelAndView.addObject("viewedProduct", viewedProductOptional.get());
        }
        return modelAndView;
    }

    @GetMapping("subtract/{id}")
    public String subtractToCart(@SessionAttribute CartDTO cart, @PathVariable Long id, @RequestParam String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()){
            return "/error.404";
        }
        if (action.equals("show")){

            cart.subTractProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }

    @GetMapping("/add/{id}")
    private String addToCart(@PathVariable Long id, @SessionAttribute CartDTO cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable Long id, Model model, HttpServletResponse response) {
        Cookie cookie = new Cookie("id", id + "");
        cookie.setMaxAge(1 * 24 * 60 * 60);
        cookie.setPath("/shop");
        response.addCookie(cookie);
        Product product = productService.findById(id).get();
        model.addAttribute("product", product);
        return "detail";
    }
}
