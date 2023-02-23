package com.example.case_study.controller;

import com.example.case_study.dto.IContractDTO;
import com.example.case_study.model.ContractDetail;
import com.example.case_study.service.contract.IContractDetailService;
import com.example.case_study.service.contract.IContractService;
import com.example.case_study.service.customer.ICustomerService;
import com.example.case_study.service.employee.IEmployeeService;
import com.example.case_study.service.facility.IAttachFacilityService;
import com.example.case_study.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private IAttachFacilityService attachFacilityService;
    @Autowired
    private IContractDetailService contractDetailService;
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IFacilityService facilityService;

    @RequestMapping("")
    public String showContractList(@RequestParam(required = false,defaultValue = "0") int page, Model model){
        Pageable pageable = PageRequest.of(page,3);
        Page<IContractDTO> contractDTOPage = contractService.findAll(pageable);
        model.addAttribute("contractDTOPage",contractDTOPage);
        model.addAttribute("contractDetail",new ContractDetail());
        model.addAttribute("attachFacilityList",attachFacilityService.findAll());
        model.addAttribute("employeeList",employeeService.findAll());
        model.addAttribute("customerList",customerService.findAllCustomer());
        model.addAttribute("facilityList",facilityService.findAll());
        return "/contract/list";
    }

    @RequestMapping("/addContractDetail")
    public String addContractDetail(@ModelAttribute ContractDetail contractDetail, RedirectAttributes redirectAttributes){
        contractDetailService.save(contractDetail);
        redirectAttributes.addFlashAttribute("success","Added Successfully");
        return "redirect:/contract";
    }
}
