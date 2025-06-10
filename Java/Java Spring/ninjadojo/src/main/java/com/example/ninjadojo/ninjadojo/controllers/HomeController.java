package com.example.ninjadojo.ninjadojo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.example.ninjadojo.ninjadojo.models.Dojo;
import com.example.ninjadojo.ninjadojo.models.Ninja;
import com.example.ninjadojo.ninjadojo.services.DojoService;
import com.example.ninjadojo.ninjadojo.services.NinjaService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class HomeController {

    @Autowired
    DojoService dojoService;
    @Autowired
    NinjaService ninjaService;

    @GetMapping("/")
    public String index() {
        return "redirect:/dojos/new";
    }
    

    @GetMapping("/dojos/new")
    public String createDojoPage(@ModelAttribute Dojo dojo) {
        return "dojo.jsp";
    }

    @GetMapping("/ninjas/new")
    public String createNinjaPage(@ModelAttribute Ninja ninja,Model model) {
        model.addAttribute("dojos", dojoService.getAllDojos());
        return "ninja.jsp";
    }

    @GetMapping("/dojos/{id}")
    public String displayNinjas(Model model,@PathVariable Long id) {

        model.addAttribute("ninjas", ninjaService.getAllNinjasByDojo(id));
        return "display.jsp";
    }

    @PostMapping("/dojos/new")
    public String createDojo(@Valid @ModelAttribute Dojo dojo,BindingResult result) {
        if (result.hasErrors()) {
            return "dojo.jsp";
        }
        dojoService.createDojo(dojo);
        return "redirect:/ninjas/new";
    }
    @PostMapping("/ninjas/new")
    public String createNinja(@Valid @ModelAttribute Ninja ninja,BindingResult result,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("dojos", dojoService.getAllDojos());
            return "ninja.jsp";
        }
        ninjaService.createNinja(ninja);
        return "redirect:/ninjas/new";
    }

    
}
