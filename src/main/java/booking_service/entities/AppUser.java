package booking_service.entities;

import java.util.List;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;
    private String userSurname;
    private String userEmail;
    private String userPhone;
    private String userPassword;

    private String userRole = "ROLE_USER";

    @ManyToOne
    private AppAdmin appAdmin;

    @OneToMany(mappedBy = "appUser")
    private List<Order> ordersList;
}