package com.example.validatesong.controller;

import com.example.validatesong.dto.SongDTO;
import com.example.validatesong.model.Song;
import com.example.validatesong.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SongController {

    @Autowired
    ISongService songService;

    @GetMapping("/song")
    public String showList(@RequestParam(required = false, defaultValue = "") String name, Model model,
                           @RequestParam(required = false, defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page,2);
        Page<Song> songPage = songService.search(name,pageable);
        model.addAttribute("page",page);
        model.addAttribute("name",name);
        model.addAttribute("songPage",songPage);
        return "/index";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("songDTO", new SongDTO());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute SongDTO songDTO, BindingResult bindingResult, Model model
            , RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("songDTO", songDTO);
            return "/create";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDTO, song);
        songService.save(song);
        redirectAttributes.addFlashAttribute("message", "added successfully!");
        return "redirect:/song";
    }

    @GetMapping("/edit")
    public String showFormEdit(@RequestParam int id, Model model) {
        Song song = songService.findById(id);
        SongDTO songDTO = new SongDTO();
        BeanUtils.copyProperties(song, songDTO);
        model.addAttribute("id",id);
        model.addAttribute("songDTO", songDTO);
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute SongDTO songDTO, BindingResult bindingResult,
                       @RequestParam int id, RedirectAttributes redirectAttributes,
                       Model model) {
        if (bindingResult.hasErrors()){
            model.addAttribute("id",id);
            model.addAttribute("songDTO",songDTO);
            return "/edit";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDTO,song);
        song.setId(id);
        songService.save(song);
        redirectAttributes.addFlashAttribute("message","edited successfully");
        return "redirect:/song";
    }
}
