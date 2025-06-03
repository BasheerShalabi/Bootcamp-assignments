package com.example.travel.travel.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.travel.travel.models.Travel;
import com.example.travel.travel.services.TravelSarvice;
import jakarta.validation.Valid;

	@Controller
	public class TravelController {	
		
		@Autowired
		TravelSarvice expense;
		
		 @GetMapping("/")
		 public String index(@ModelAttribute("Travel") Travel travel,Model model) {
			 model.addAttribute("travel",expense.allExpense());
			 return "index.jsp";
		 }

		 @PostMapping("/form")
		 public String createExpense(@Valid @ModelAttribute("Travel") Travel travel,BindingResult result){
		     if (result.hasErrors()) {
		         return "index.jsp"; 
		     }
		     expense.createExpense(travel);
		     return "redirect:/"; 
		 }
		 
		 @GetMapping("/expense/edit/{id}")
		 public String desplay(Model model,@PathVariable Long id) {
			 Travel travel1 =expense.findExpenser(id);
			 model.addAttribute("Travel", travel1);
			 return "edit.jsp";
		 }
		 	@RequestMapping(value="/update/expense/{id}", method=RequestMethod.PUT)
		 public String update(
		     @Valid @ModelAttribute("Travel") Travel travel,
		     BindingResult result,
		     @PathVariable("id") Long id,
		     Model model) {
		     if (result.hasErrors()) {
		         return "edit.jsp"; 
		     }

		     travel.setId(id);

		     expense.updateExpense(travel);

		     return "redirect:/"; 
		 }
		 
		 	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
		    public String destroy(@PathVariable("id") Long id) {
		 		expense.deleteExpense(id);
		        return "redirect:/"; 
		        }
		 	
		 	@GetMapping("/expense/{id}")
			 public String displayExpense(@PathVariable("id") Long id,Model model) {
				 model.addAttribute("travel",expense.findExpenser(id));
				 return "new.jsp";
			 }
		 
//		 	
		    
//		   
	}
		 	