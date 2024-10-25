package booking_service.entities;

import java.util.List;
import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "admins")
public class AppAdmin {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String surname;
    private String email;
    private String password;
    private boolean confirmationPassword;
    private String role = "ROLE_ADMIN";

    @OneToMany(mappedBy = "appAdmin")
    private List<AppUser> userList;

    @OneToMany(mappedBy = "appAdmin")
    private List<Ticket> ticketsList;
}