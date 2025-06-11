package com.example.booksapi.booksapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booksapi.booksapi.models.Book;
import com.example.booksapi.booksapi.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    @Autowired
    BookRepository bookRepository;

    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    public Book updateBook(Book b , long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            b.setId(id);
            return bookRepository.save(b);
        } else {
            return null;
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}