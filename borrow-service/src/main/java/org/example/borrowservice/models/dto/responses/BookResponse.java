package org.example.borrowservice.models.dto.responses;

import com.fasterxml.jackson.annotation.JsonAlias;

public record BookResponse(
        @JsonAlias("id") Long bookId,
        String title,
        String author,
        Integer availableQuantity
) {
}
