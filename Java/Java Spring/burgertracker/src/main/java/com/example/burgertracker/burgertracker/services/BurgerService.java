package com.example.burgertracker.burgertracker.services;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.burgertracker.burgertracker.models.Burger;
import com.example.burgertracker.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {

    @Autowired
    BurgerRepository burgerRepository;

    public List<Burger> getAllBurgers() {
        return burgerRepository.findAllBurgers();
    }

    public Burger createBurger(Burger burger){
        return burgerRepository.save(burger);
    }

    public Burger updateBurger(Burger burger) {
        return burgerRepository.save(burger);
    }

    public Burger findBurger(Long id){
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if (optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null; // or throw an exception if preferred
        }
    }

}
