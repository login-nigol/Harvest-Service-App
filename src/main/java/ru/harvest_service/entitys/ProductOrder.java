package ru.harvest_service.entitys;

import ru.harvest_service.entitys.enums.OrderStatus;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "order_id")
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_date")
    private LocalDateTime OrderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderPaymentStatus;
}
