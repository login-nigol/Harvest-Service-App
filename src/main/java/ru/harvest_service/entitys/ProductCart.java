package ru.harvest_service.entitys;

import com.fasterxml.jackson.annotation.JsonBackReference;


import java.time.LocalDateTime;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

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


    @Column(name = "pr_cart_order_amount")
    private Double productcartOrderAmount;

    @JsonBackReference
    @JoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private AppUser user;
}
