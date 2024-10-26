package booking_service.repositories;

import booking_service.entities.AppUser;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    // кастомный метод
    List<AppUser> findAllByUserEmail(String email);
}