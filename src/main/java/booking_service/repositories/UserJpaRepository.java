package booking_service.repositories;

import booking_service.entitys.AppUser;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface UserJpaRepository extends JpaRepository<String, Long> {
    Optional<AppUser> findByEmail(String email);
}
