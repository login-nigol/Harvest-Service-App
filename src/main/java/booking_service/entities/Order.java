package booking_service.entities;

import booking_service.enums.OrderState;

import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String orderTitle;
    private String orderInfo;
    private LocalDateTime orderCreatedAt;
    private BigDecimal orderAmount;

    @Enumerated(EnumType.STRING)
    private OrderState orderState;

    @OneToMany(mappedBy = "order")
    private List<Ticket> ticketsList;

    @OneToMany(mappedBy = "order")
    private List<Payment> paymentList;

    @ManyToOne
    private User user;
}