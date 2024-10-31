package ru.harvest_service.entitys;

import ru.harvest_service.entitys.enums.OrderStatus;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.time.ZonedDateTime;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@Table(name = "product_orders")
public class ProductOrder {

    @Id
    @Column(name = "pr_order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pr_order_title")
    private String ProductOrderTitle;

    @Column(name = "pr_order_desc")
    private String ProductOrderDescription;

    @Column(name = "order_amount")
    private Double OrderAmount;

    @Column(name = "order_date")
    private ZonedDateTime OrderDate; // хранит временную зону

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderPaymentStatus;

    @JsonBackReference
    @JoinColumn(name = "pr_cart_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductCart productcart;
}
