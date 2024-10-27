package booking_service.repositories;

import booking_service.entities.Administrator;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
    // кастомный метод
    List<Administrator> findAppAdminByAdminEmail(String email);
}
