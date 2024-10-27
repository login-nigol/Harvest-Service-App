package booking_service.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private String paymentInfo;
    private LocalDateTime paymentCreatedAt;

    @ManyToOne
    private Order order;
}