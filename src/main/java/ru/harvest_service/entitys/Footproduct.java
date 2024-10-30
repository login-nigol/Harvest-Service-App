package ru.harvest_service.entitys;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class
Footproduct {

    @Id
    @Column(name = "foot_pr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long footproductId;

    @Column(name = "pr_title_id")
    private String footproductTitle;

    @Column(name = "pr_desc_id")
    private String productDescription;

    @Column(name = "pr_price_id")
    private String productPrice;

    @JsonBackReference
    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AppUser user;
}
