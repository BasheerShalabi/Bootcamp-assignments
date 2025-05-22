package com.example.pathvariable.pathvariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class PathvariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PathvariablesApplication.class, args);
	}

	@RestController
	@RequestMapping("/daikichi")
	public class DaikichiController{

		@GetMapping
		public String index() {
			return "Welcome!";
		}

		@GetMapping("/today")
		public String today() {
			return "Today you will find luck in all your endeavors!";
		}

		@GetMapping("/tomorrow")
		public String tomorrow() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas and experiences!";
		}

		@GetMapping("/travel/{city}")
		public String travel(@PathVariable("city") String city) {
			return "Congratulations! You will soon travel to "+ city + "!";
		}

		@GetMapping("/lotto/{number}")
		public String lotto(@PathVariable("number") int number) {
			if (number % 2 == 0) {
				return "You will take a grand journey in the near future, but be wary of tempting offers.";
			} else {
				return "You have enjoyed the fruits of your labor but now is a great time to share with others.";
			}
		}
		
		

		
	}
}
