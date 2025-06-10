package com.example.ninjadojo.ninjadojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ninjadojo.ninjadojo.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {
    
    List<Dojo> findAll(); 
    
}
