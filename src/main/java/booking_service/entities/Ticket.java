package booking_service.entities;

import java.util.List;
import java.math.BigDecimal;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "tickets_info")
public class Ticket {

    @Id
    @Column(name = "ticket_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String imagePath;
    private BigDecimal price;
    private BigDecimal discount;
    private Long orderId;

    @ManyToOne
    private AppAdmin appAdmin; // поле связано с mappedBy="appadmin"

    @ManyToMany(mappedBy = "ticketList")
    private List<Order> orderList;
}
