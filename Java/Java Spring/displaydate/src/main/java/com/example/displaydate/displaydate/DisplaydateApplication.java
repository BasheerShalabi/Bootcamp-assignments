package com.example.displaydate.displaydate;

import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
public class DisplaydateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplaydateApplication.class, args);
	}

	@Controller
	public class TemplateController {

		
		@RequestMapping("")
		public String index() {
			return "index.jsp"; 
		}

		@RequestMapping("/date")
		public String getDate(Model model) {
			model.addAttribute("currentDate", java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, LLL dd, yyyy")));
			return "date.jsp"; 
		}

		@RequestMapping("/time")
		public String getTime(Model model) {
			model.addAttribute("currentTime", java.time.LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a")));
			return "time.jsp";
		}
	}

}
