package com.example.omikuji.omikuji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
@RequestMapping("/omikuji")
public class OmikujiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmikujiApplication.class, args);
	}

	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/save")
	public String form(RedirectAttributes redirectAttributes,
	@RequestParam(value = "name") String name,
	@RequestParam(value = "city") String city,
	@RequestParam(value = "hobby") String hobby,
	@RequestParam(value = "thing") String thing,
	@RequestParam(value = "number") Integer number,
	@RequestParam(value = "somthing") String something) {
		redirectAttributes.addFlashAttribute("name", name);
		redirectAttributes.addFlashAttribute("city", city);
		redirectAttributes.addFlashAttribute("hobby", hobby);
		redirectAttributes.addFlashAttribute("thing", thing);
		redirectAttributes.addFlashAttribute("number", number);
		redirectAttributes.addFlashAttribute("something", something);
		return "redirect:/omikuji/show";
		
	}
	@RequestMapping("/show")
	public String result() {
		return "show.jsp";
	}


}
