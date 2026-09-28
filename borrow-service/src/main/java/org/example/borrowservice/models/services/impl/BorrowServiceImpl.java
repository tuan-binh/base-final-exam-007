package org.example.borrowservice.models.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.borrowservice.models.constants.BorrowStatus;
import org.example.borrowservice.models.dto.requests.CreateBorrowDetailRequest;
import org.example.borrowservice.models.dto.requests.CreateBorrowRequest;
import org.example.borrowservice.models.dto.responses.BorrowDetailResponse;
import org.example.borrowservice.models.dto.responses.BorrowResponse;
import org.example.borrowservice.models.dto.responses.BookResponse;
import org.example.borrowservice.models.entities.Borrow;
import org.example.borrowservice.models.entities.BorrowDetail;
import org.example.borrowservice.models.repositories.BorrowDetailRepository;
import org.example.borrowservice.models.repositories.BorrowRepository;
import org.example.borrowservice.models.services.BorrowService;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BorrowServiceImpl implements BorrowService {

        private final BorrowRepository borrowRepository;
        private final BorrowDetailRepository borrowDetailRepository;
        private final BookGatewayService bookGatewayService;

        @Override
        public BorrowResponse createBorrow(CreateBorrowRequest request) {
                throw new UnsupportedOperationException();
        }
}
