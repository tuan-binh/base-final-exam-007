package org.example.bookservice.models.services;

import org.example.bookservice.models.entities.Book;

public interface BookService {
    Book getBookById(Long id);
}
