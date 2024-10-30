package ru.harvest_service.entitys;

import ru.harvest_service.entitys.enums.UserRole;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class AppUser {

    @Id
    @Column(name = "u_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "u_name")
    private String userName;

    @Column(name = "u_email")
    private String userEmail;

    @Column(name = "u_password")
    private String userPassword;

    @Column(name = "u_role")
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @JsonManagedReference
    @JoinColumn(name = "foot_pr_id")
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private Set<Footproduct> footProducts;

    @JsonManagedReference
    @JoinColumn(name = "pr_cart_id")
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private ProductCart productCart;
}
















