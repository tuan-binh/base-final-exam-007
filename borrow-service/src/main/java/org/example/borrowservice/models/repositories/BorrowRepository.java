package org.example.borrowservice.models.repositories;

import org.example.borrowservice.models.entities.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {
}
