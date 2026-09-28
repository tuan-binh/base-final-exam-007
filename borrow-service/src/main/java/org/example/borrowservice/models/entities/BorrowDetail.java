package org.example.borrowservice.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "borrow_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BorrowDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "borrow_id")
    private Borrow borrow;

    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "quantity")
    private Integer quantity;

}
