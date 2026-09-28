package org.example.borrowservice.models.dto.responses;

public record BorrowDetailResponse(
        Long id,
        Long bookId,
        String bookTitle,
        String author,
        Integer quantity
) {
}
