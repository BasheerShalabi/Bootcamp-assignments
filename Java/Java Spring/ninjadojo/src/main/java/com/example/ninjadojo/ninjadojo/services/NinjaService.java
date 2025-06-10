package com.example.ninjadojo.ninjadojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ninjadojo.ninjadojo.models.Dojo;
import com.example.ninjadojo.ninjadojo.models.Ninja;
import com.example.ninjadojo.ninjadojo.repositories.DojoRepo;
import com.example.ninjadojo.ninjadojo.repositories.NinjaRepo;

@Service
public class NinjaService {

    @Autowired
    DojoRepo dojoRepo;
    @Autowired
    NinjaRepo ninjaRepo;

    public Ninja createNinja(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }

    public List<Ninja> getAllNinjasByDojo(Long id) {
        Optional<Dojo> dojoOpt = dojoRepo.findById(id);
        if (dojoOpt.isEmpty()) {
            return List.of();
        }
        return ninjaRepo.findByDojo(dojoOpt.get());
    }
}
