package org.example.bookservice.models.services;

import org.example.bookservice.exceptions.BookNotFoundException;
import org.example.bookservice.models.entities.Book;
import org.example.bookservice.models.repositories.BookRepository;
import org.example.bookservice.models.services.impl.BookServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.cache.annotation.Cacheable;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class BookServiceImplTest {

    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookServiceImpl(bookRepository);
    }

    @Test
    void getBookByIdReturnsBookWhenItExists() {
        Book book = new Book(1L, "Laptop", "Laptop văn phòng", new BigDecimal("15000000.00"), 5);
        when(bookRepository.findById(1L)).thenReturn(Optional.of(book));

        Book result = bookService.getBookById(1L);

        assertSame(book, result);
        verify(bookRepository).findById(1L);
    }

    @Test
    void getBookByIdThrowsExceptionWhenItDoesNotExist() {
        when(bookRepository.findById(99L)).thenReturn(Optional.empty());

        BookNotFoundException exception = assertThrows(
                BookNotFoundException.class,
                () -> bookService.getBookById(99L)
        );

        assertEquals("Không tìm thấy phim với id: 99", exception.getMessage());
    }

    @Test
    void getBookByIdUsesBooksCacheWithIdAsKey() throws NoSuchMethodException {
        Cacheable cacheable = BookServiceImpl.class
                .getMethod("getBookById", Long.class)
                .getAnnotation(Cacheable.class);

        assertEquals("books", cacheable.cacheNames()[0]);
        assertEquals("#id", cacheable.key());
        assertTrue(cacheable.sync());
        assertTrue(Serializable.class.isAssignableFrom(Book.class));
    }
}
