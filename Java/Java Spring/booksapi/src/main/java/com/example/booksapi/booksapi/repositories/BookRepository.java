package com.example.booksapi.booksapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.booksapi.booksapi.models.Book;

public interface BookRepository extends CrudRepository<Book,Long> {

    List<Book> findAll();
    
}
