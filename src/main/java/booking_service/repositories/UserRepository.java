package booking_service.repositories;

import booking_service.entities.User;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // кастомный метод
    List<User> findAllByUserEmail(String userEmail);

    boolean existsByUserEmail(String userEmail);
}