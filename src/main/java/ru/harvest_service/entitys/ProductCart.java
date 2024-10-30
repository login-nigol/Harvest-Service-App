package ru.harvest_service.entitys;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.NoArgsConstructor;
import ru.harvest_service.entitys.enums.OrderPaymentStatus;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@NoArgsConstructor
@Table(name = "product_cart")
public class ProductCart {

    @Id
    @Column(name = "pr_cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productcartId;

    @Column(name = "pr_cart_info")
    private String productcartInfo;

    @Column(name = "pr_cart_order_date")
    private LocalDateTime productcartOrderDate;

    @Column(name = "pr_cart_order_amount")
    private Integer productcartOrderAmount;

    @Enumerated(EnumType.STRING)
    private OrderPaymentStatus orderPaymentStatus;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "user_id")
    private AppUser user;
}
