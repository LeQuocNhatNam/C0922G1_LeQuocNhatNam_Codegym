package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class Calculator {
    @GetMapping("")
    public String showForm() {
        return "calculator";
    }

    @GetMapping("/result")
    public ModelAndView calculate(@RequestParam double n1, @RequestParam double n2, @RequestParam int submit) {
        ModelAndView modelAndView = new ModelAndView("result");
        double result = 0;
        switch (submit) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1-n2;
                break;
            case 3:
                result = n1*n2;
                break;
            case 4:
                if (n2==0){
                    modelAndView.addObject("result","undefined");
                    return modelAndView;
                }
                result = n1/n2;
                break;
        }
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}
