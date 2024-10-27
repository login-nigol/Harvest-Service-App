package booking_service.entities;

import java.util.List;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "administrators")
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;

    private String adminName;
    private String adminSurname;
    private String adminEmail;
    private String adminPhone;
    private String adminPassword;

    private String adminRole = "ROLE_ADMIN";
    private Integer user_id;

    @OneToMany(mappedBy = "administrator")
    private List<User> usersList;
}