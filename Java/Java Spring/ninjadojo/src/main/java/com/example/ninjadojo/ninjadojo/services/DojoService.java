package com.example.ninjadojo.ninjadojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ninjadojo.ninjadojo.models.Dojo;
import com.example.ninjadojo.ninjadojo.repositories.DojoRepo;

@Service
public class DojoService {
    @Autowired
    DojoRepo dojoRepo;

    public Dojo createDojo(Dojo dojo) {
        return dojoRepo.save(dojo);
    }

    public List<Dojo> getAllDojos() {
        return dojoRepo.findAll();
    }

}
