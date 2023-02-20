package com.example.case_study.controller.customer;

import com.example.case_study.dto.CustomerDTO;
import com.example.case_study.model.Customer;
import com.example.case_study.service.customer.ICustomerService;
import com.example.case_study.service.customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("")
    public String showAll(@RequestParam(required = false, defaultValue = "") String name,
                          @RequestParam(required = false, defaultValue = "") String email,
                          @RequestParam(required = false, defaultValue = "0") int customerTypeId,
                          @RequestParam(required = false, defaultValue = "0") int page,
                          Model model) {
        Pageable pageable = PageRequest.of(page, 3);
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("customerTypeId", customerTypeId);
        model.addAttribute("customerPage", customerService.search(name, email, customerTypeId, pageable));
        return "customer/list";
    }

    @GetMapping("/edit")
    public String showEditForm(@RequestParam int id, Model model) {
        Customer customer = customerService.findById(id);
        CustomerDTO customerDTO = new CustomerDTO();
        BeanUtils.copyProperties(customer, customerDTO);
        model.addAttribute("customerDTO", customerDTO);
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        return "/customer/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute CustomerDTO customerDTO, RedirectAttributes redirectAttributes) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success", "edited successfully");
        return "redirect:/customer";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("success", "Deleted Successfully");
        return "redirect:/customer";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("customerDTO", new CustomerDTO());
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        return "/customer/create";
    }

    @PostMapping("/create")
    public String createCustomer(@ModelAttribute CustomerDTO customerDTO, RedirectAttributes redirectAttributes) {
        customerDTO.setFlag(true);
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success", "Successfully Created");
        return "redirect:/customer";
    }
}
