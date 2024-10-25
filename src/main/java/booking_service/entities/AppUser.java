package booking_service.entities;

import java.util.List;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "users_info")
public class AppUser {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surName;
    private String email;
    private String phone;
    private String password;
    private String role = "ROLE_USER";

    @ManyToOne
    private AppAdmin appAdmin; // поле связано с mappedBy="appadmin"

    @OneToMany
    private List<Order> orderList;

    @OneToMany
    private List<Ticket> ticketList;
}