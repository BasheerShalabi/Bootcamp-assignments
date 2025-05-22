package com.example.routes.routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class RoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutesApplication.class, args);
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
		

		
	}

}
