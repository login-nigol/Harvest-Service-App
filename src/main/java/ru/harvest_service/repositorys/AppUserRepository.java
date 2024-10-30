package ru.harvest_service.repositorys;

import ru.harvest_service.entitys.AppUser;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, String> {

    List<AppUser> findAllByUserEmail(String email);
}
