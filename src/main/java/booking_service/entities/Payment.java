package booking_service.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.Data;

@Data
@Entity
@Table(name = "payment_info")
public class Payment {

    @Id
    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdAt;
    private String orderStatus;

    @OneToOne
    private Order order;
}
