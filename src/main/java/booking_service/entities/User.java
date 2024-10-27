package booking_service.entities;

import java.util.List;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;
    private String userSurname;
    private String userEmail;
    private String userPhone;
    private String userPassword;

    private String userRole = "ROLE_USER";
    private Integer orderId;

    @ManyToOne
    private Administrator administrator;

    @OneToMany(mappedBy = "user")
    private List<Order> ordersList;
}