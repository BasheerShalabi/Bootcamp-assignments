package com.example.travel.travel.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travel.travel.models.Travel;
import com.example.travel.travel.repositories.TravelRepo;

import java.util.List;

@Service
public class TravelSarvice {


	@Autowired
	TravelRepo Repo;
        
    public List<Travel> allExpense() {
        return Repo.findAll();
    }
    public Travel createExpense(Travel travel) {
        return Repo.save(travel);
    }
    public Travel findExpenser(Long id) {
        Optional<Travel> optionalTravel = Repo.findById(id);
        if(optionalTravel.isPresent()) {
            return optionalTravel.get();
        } else {
            return null;
        }
    }

	public void deleteExpense(Long id) {
		// TODO Auto-generated method stub
		Optional<Travel> optionalTravel = Repo.findById(id);
        if(optionalTravel.isPresent()) {
        	Repo.deleteById(id);
             }
        
		
	}
	 public Travel updateExpense(Travel burger) {
	        return Repo.save(burger);
	    }
}