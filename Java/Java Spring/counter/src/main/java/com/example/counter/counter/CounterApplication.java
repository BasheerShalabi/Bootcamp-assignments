package com.example.counter.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}

	@RequestMapping("/")
	public String counter(HttpSession session) {
		
		if(session.getAttribute("count")==null){
		session.setAttribute("count", 0);
	}
		return "index.jsp"; 
	}

	@RequestMapping("/increment")
	public String increment(HttpSession session) {
		if(session.getAttribute("count")==null){
			session.setAttribute("count", 0);
		}
		int count = (int) session.getAttribute("count");
		count++;
		session.setAttribute("count", count);
		return "welcome.jsp";
	}

}
