package com.example.case_study.controller;

import com.example.case_study.dto.FacilityDTO;
import com.example.case_study.model.Facility;
import com.example.case_study.service.facility.IFacilityService;
import com.example.case_study.service.facility.IFacilityTypeService;
import com.example.case_study.service.facility.IRentTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IFacilityTypeService facilityTypeService;
    @Autowired
    private IRentTypeService rentTypeService;

    @GetMapping("")
    public String searchFacility(@RequestParam(required = false, defaultValue = "") String name,
                                 @RequestParam(required = false, defaultValue = "0") int facilityTypeId,
                                 @RequestParam(required = false, defaultValue = "0") int page,
                                 Model model) {
        Pageable pageable = PageRequest.of(page, 3);
        Page<Facility> facilityPage = facilityService.searchFacility(name, facilityTypeId, pageable);
        model.addAttribute("facilityPage", facilityPage);
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("facilityTypeId",facilityTypeId);
        model.addAttribute("name",name);
        return "/facility/list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("facilityDTO",new FacilityDTO());
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        model.addAttribute("rentTypeList",rentTypeService.findAll());
        return "/facility/create";
    }
    @PostMapping("/create")
    public String createForm(@ModelAttribute FacilityDTO facilityDTO, RedirectAttributes redirectAttributes){
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDTO,facility);
        facility.setFlag(true);
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("success","Added Successfully");
        return "redirect:/facility";
    }

    @GetMapping("/edit")
    public String showEditForm(@RequestParam int id, Model model){
        Facility facility = facilityService.findById(id);
        FacilityDTO facilityDTO = new FacilityDTO();
        BeanUtils.copyProperties(facility,facilityDTO);
        model.addAttribute("facilityDTO",facilityDTO);
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        model.addAttribute("rentTypeList",rentTypeService.findAll());
        return "facility/edit";
    }

    @PostMapping("edit")
    public String edit(@ModelAttribute FacilityDTO facilityDTO, RedirectAttributes redirectAttributes){
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDTO,facility);
        facility.setFlag(true);
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("success","Edited Successfully");
        return "redirect:/facility";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes){
        Facility facility = facilityService.findById(id);
        facility.setFlag(false);
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("success","Deleted Successfully");
        return "redirect:/facility";
    }
}
