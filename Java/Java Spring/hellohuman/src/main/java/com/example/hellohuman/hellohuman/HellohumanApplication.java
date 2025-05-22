package com.example.hellohuman.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}

	@RestController
	public class HelloController{

		@RequestMapping("/")
		public String fullname(@RequestParam(value = "name",required = false,defaultValue = "Human") String name , @RequestParam(value = "last_name",required = false,defaultValue = "") String last_name ,@RequestParam(value = "times",required = false,defaultValue = "1") int times) {
			String response = "";
			for (int i = 0; i < times; i++) {
				 response += "Hello " + name + " " + last_name + "! ";
			}
			return response;
		}
		
		
	}

}
