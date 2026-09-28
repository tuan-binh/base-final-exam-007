package org.example.borrowservice.models.dto.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record CreateBorrowDetailRequest(
        @NotNull(message = "Book id is required")
        @Min(value = 1, message = "Book id must be greater than 0")
        Long bookId,

        @NotNull(message = "Quantity is required")
        @Min(value = 1, message = "Quantity must be greater than 0")
        Integer quantity
) {
}
