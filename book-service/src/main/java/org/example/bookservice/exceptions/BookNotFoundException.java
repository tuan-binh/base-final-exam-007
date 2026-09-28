package org.example.bookservice.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("Không tìm thấy phim với id: " + id);
    }
}
