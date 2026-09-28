package org.example.borrowservice.clients;

import org.example.borrowservice.models.dto.responses.BookResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "book-service", path = "/api/v1/books")
public interface BookClient {

    @GetMapping("/{id}")
    BookResponse getBookById(@PathVariable Long id);
}
