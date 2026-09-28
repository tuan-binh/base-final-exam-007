package org.example.borrowservice.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.example.borrowservice.models.constants.BorrowStatus;

@Entity
@Table(name = "borrows")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_email")
    private String studentEmail;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private BorrowStatus status;

}
