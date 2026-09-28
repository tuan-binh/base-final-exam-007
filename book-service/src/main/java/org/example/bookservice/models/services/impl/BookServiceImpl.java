package org.example.bookservice.models.services.impl;

import org.example.bookservice.exceptions.BookNotFoundException;
import org.example.bookservice.models.entities.Book;
import org.example.bookservice.models.repositories.BookRepository;
import org.example.bookservice.models.services.BookService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
    }
}
