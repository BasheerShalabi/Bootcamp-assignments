package com.example.burgertracker.burgertracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.burgertracker.burgertracker.models.Burger;

@Repository
public interface BurgerRepository extends CrudRepository<Burger,Long> {

    List<Burger> findAll();

}
