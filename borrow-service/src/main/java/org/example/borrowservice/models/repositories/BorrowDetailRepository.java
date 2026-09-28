package org.example.borrowservice.models.repositories;

import org.example.borrowservice.models.entities.BorrowDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowDetailRepository extends JpaRepository<BorrowDetail, Long> {
}
