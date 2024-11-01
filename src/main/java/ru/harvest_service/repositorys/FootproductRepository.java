package ru.harvest_service.repositorys;

import ru.harvest_service.entitys.Footproduct;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface FootproductRepository extends JpaRepository<Footproduct, Long> {

    List<Footproduct> findAllByFootproductId(Long id);
}
