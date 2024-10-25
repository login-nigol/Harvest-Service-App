package booking_service.entities;

import booking_service.enums.OrderState;

import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "orders_info")
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDateTime createdAt;
    private BigDecimal bookingAmount;
    private Long ticketId;

    @Enumerated(EnumType.STRING)
    private OrderState orderState;

    @ManyToMany
    @JoinTable(name = "orders_tickets", // промежуточная таблица
            joinColumns = @JoinColumn(name = "order_id"), // внешний ключ таблицы order
            inverseJoinColumns = @JoinColumn(name = "ticket_id")) // внешний ключ таблицы tickets
    private List<Ticket> ticketList; // ссылается на Ticket

    @ManyToOne
    private AppUser appUser;

    @OneToOne
    private Payment payment;
}