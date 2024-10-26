package booking_service.entities;

import java.util.List;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "admins")
public class AppAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;

    private String adminName;
    private String adminSurname;
    private String adminEmail;
    private String adminPhone;
    private String adminPassword;

    private String adminRole = "ROLE_ADMIN";

    @OneToMany(mappedBy = "appAdmin")
    private List<AppUser> usersList;
}