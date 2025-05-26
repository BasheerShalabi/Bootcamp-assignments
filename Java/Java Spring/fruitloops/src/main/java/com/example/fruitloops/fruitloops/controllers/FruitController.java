package com.example.fruitloops.fruitloops.controllers;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.fruitloops.fruitloops.classes.Item;

@Controller
public class FruitController {

    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", .75));
        fruits.add(new Item("batata", 3.55));
        fruits.add(new Item("spenich", 4.45));
        fruits.add(new Item("apple", 3.75));
        fruits.add(new Item("banana", 2.75));
        fruits.add(new Item("avocado", 5.36));
        fruits.add(new Item("tomato", 7));
        fruits.add(new Item("grenades", 10));

        model.addAttribute("fruits", fruits);
                return "index.jsp";
                
    }
    
}
