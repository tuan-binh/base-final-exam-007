package org.example.borrowservice.models.services.impl;

import feign.FeignException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.example.borrowservice.clients.BookClient;
import org.example.borrowservice.exceptions.BookNotFoundException;
import org.example.borrowservice.exceptions.BookServiceException;
import org.example.borrowservice.models.dto.responses.BookResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookGatewayService {

    private final BookClient bookClient;

    public BookResponse getBookById(Long bookId) {
        throw new UnsupportedOperationException();
    }
}
