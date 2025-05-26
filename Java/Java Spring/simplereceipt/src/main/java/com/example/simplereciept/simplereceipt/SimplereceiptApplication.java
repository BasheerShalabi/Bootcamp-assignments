package com.example.simplereciept.simplereceipt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

@SpringBootApplication
public class SimplereceiptApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplereceiptApplication.class, args);
	}

	@Controller
	public class ReceiptController {
		@RequestMapping("/")
		public String index(Model model) {
			
			String name = "Gbdbdfbfdb";
			String itemName = "Copperdfbdfbdbffdb wire";
			double price = 5.25;
			String description = "Metal stridbfdfbps, also an illustration of nanoseconds.";
			String vendor = "Little Things Codfbdbfdbrner Store";
			
			model.addAttribute("name", name);
			model.addAttribute("itemName", itemName);
			model.addAttribute("price", price);
			model.addAttribute("description", description);
			model.addAttribute("vendor", vendor);
				
			return "index.jsp";
			
		}
	}
	

}
