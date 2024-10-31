package ru.harvest_service.entitys;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "product_carts")
public class ProductCart {

    @Id
    @Column(name = "pr_cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productCartId;

    @Column(name = "pr_cart_info")
    private String productCartInfo;

    @JsonBackReference
    @JoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private AppUser user;

    @JsonManagedReference
    @OneToMany(mappedBy = "productcart", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private Set<ProductOrder> productOrders;
}
