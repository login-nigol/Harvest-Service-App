package booking_service.repositories;

import booking_service.entities.AppAdmin;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface AppAdminRepository extends JpaRepository<AppAdmin, Long> {
    // кастомный метод
    List<AppAdmin> findByEmail(String email);
}
