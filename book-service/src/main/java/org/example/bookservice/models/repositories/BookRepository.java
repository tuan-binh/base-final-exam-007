package org.example.bookservice.models.repositories;

import org.example.bookservice.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
