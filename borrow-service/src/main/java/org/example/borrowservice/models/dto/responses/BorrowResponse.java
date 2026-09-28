package org.example.borrowservice.models.dto.responses;

import org.example.borrowservice.models.constants.BorrowStatus;

import java.util.List;

public record BorrowResponse(
        Long id,
        String studentName,
        String studentEmail,
        BorrowStatus status,
        List<BorrowDetailResponse> items
) {
}
