package org.example.borrowservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.borrowservice.models.dto.requests.CreateBorrowRequest;
import org.example.borrowservice.models.dto.responses.BorrowResponse;
import org.example.borrowservice.models.services.BorrowService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/borrows")
@RequiredArgsConstructor
public class BorrowController {

    private final BorrowService borrowService;

    @PostMapping
    public ResponseEntity<BorrowResponse> createBorrow(@Valid @RequestBody CreateBorrowRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(borrowService.createBorrow(request));
    }
}
