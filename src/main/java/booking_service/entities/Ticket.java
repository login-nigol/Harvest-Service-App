package booking_service.entities;

import java.util.List;
import java.math.BigDecimal;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    private String ticketTitle;
    private String ticketDescription;
    private String ticketImagePath;
    private BigDecimal ticketPrice;
    private BigDecimal ticketDiscount;

    @ManyToOne
    private Order order;
}