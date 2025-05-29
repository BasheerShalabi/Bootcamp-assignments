package com.example.booksapi.booksapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.booksapi.booksapi.models.Book;
import com.example.booksapi.booksapi.services.BookService;

@RestController
@RequestMapping("/api")
public class BookApi {
    @Autowired
    BookService bookService;
    // other methods removed for brevity
    @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
    public Book update(
            @PathVariable("id") Long id, 
            @RequestParam(value="title") String title, 
            @RequestParam(value="description") String desc, 
            @RequestParam(value="language") String lang,
            @RequestParam(value="pages") Integer numOfPages) {
        Book book = bookService.updateBook(new Book(title, desc, lang, numOfPages),id);
        return book;
    }

    @PostMapping(value="/books/create")
    public Book create(
            @RequestParam(value="title") String title, 
            @RequestParam(value="description") String desc, 
            @RequestParam(value="language") String lang,
            @RequestParam(value="pages") Integer numOfPages) {
        Book book = bookService.createBook(new Book(title, desc, lang, numOfPages));
        return book;
    }
    
    @RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
