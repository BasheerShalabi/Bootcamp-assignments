package com.example.ninjagold.ninjagold;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;


@SpringBootApplication
@Controller
public class FlashdataApplication {

	private static ArrayList<String> activities = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(FlashdataApplication.class, args);
	}

	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}

		if (session.getAttribute("activities") == null) {
			session.setAttribute("activities", activities);
		}
		
		return "index.jsp";
	}

	@PostMapping("/find")
	public String farm(@RequestParam int min,@RequestParam int max, @RequestParam String location, HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		int earnedGold = 0;
		String activity = "";
		System.out.println("Location: " + location);
		if(location.equals("Quest")){
			int chance = (int) (Math.random() * 100);
			if(chance > 50) {
			 earnedGold = (int) (Math.random() * (max - min + 1)) + min;
			 activity = "<p style='color: green;'>You Completed a " + location + " and earned " + earnedGold + " gold.</p>";
			} else {
			 earnedGold = -((int) (Math.random() * (max - min + 1)) - min);
			 activity = "<p style='color: red;'>You Failed a " + location + " and lost " + earnedGold + " gold.</p>";
			}
		}else{
			 earnedGold = (int) (Math.random() * (max - min + 1)) + min;
			 activity = "<p style='color: green;'>You entered a " + location + " and earned " + earnedGold + " gold.</p>";
		}
		gold += earnedGold;
		session.setAttribute("gold", gold);
		activities.add(activity);
		session.setAttribute("activities", activities);
		return "redirect:/";
	}
	
}
