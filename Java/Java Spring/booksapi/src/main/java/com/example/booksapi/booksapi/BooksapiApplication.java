package com.example.booksapi.booksapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
public class BooksapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksapiApplication.class, args);
	}

	@Controller
	public class HomeController {
		@RequestMapping("/")
		public String index() {
			return "index.jsp";
		}
		
	}

}
