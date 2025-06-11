package com.example.booksapi.booksapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.booksapi.booksapi.services.BookService;

@Controller
public class BookController {

	@Autowired
    BookService bookService;

	@GetMapping("/books")
    public String displayBooks(Model model) {
		model.addAttribute("books", bookService.allBooks());
        return "all.jsp";
    }

	@RequestMapping("/books/{id}")
	public String index(@PathVariable("id") Long id,Model model) {
		model.addAttribute("book", bookService.findBook(id));
		return "index.jsp";
	}
	
}

