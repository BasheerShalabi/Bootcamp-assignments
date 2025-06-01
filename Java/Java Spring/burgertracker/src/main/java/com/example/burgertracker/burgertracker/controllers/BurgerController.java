package com.example.burgertracker.burgertracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.burgertracker.burgertracker.models.Burger;
import com.example.burgertracker.burgertracker.services.BurgerService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class BurgerController {
    @Autowired
    BurgerService burgerService;

    @GetMapping("/")
    public String index(Model model,@ModelAttribute Burger burger) {
        model.addAttribute("burgers", burgerService.getAllBurgers());
        return "index.jsp";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Burger burger,BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        }
        burgerService.createBurger(burger);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("burger", burgerService.findBurger(id));
        return "edit.jsp";
    }

    @PostMapping("/edit/{id}")
    public String edit(@Valid @ModelAttribute Burger burger,BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        }
        burgerService.updateBurger(burger);
        return "redirect:/";
    }

    
    

}
