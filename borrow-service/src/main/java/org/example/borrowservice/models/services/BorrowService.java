package org.example.borrowservice.models.services;

import org.example.borrowservice.models.dto.requests.CreateBorrowRequest;
import org.example.borrowservice.models.dto.responses.BorrowResponse;

public interface BorrowService {

    BorrowResponse createBorrow(CreateBorrowRequest request);
}
