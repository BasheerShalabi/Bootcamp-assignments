package com.example.ninjadojo.ninjadojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ninjadojo.ninjadojo.models.Dojo;
import com.example.ninjadojo.ninjadojo.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja,Long> {
    
    List<Ninja> findByDojo(Dojo dojo);

}
