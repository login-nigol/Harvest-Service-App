package ru.harvest_service.repositorys;

import ru.harvest_service.entitys.ProductOrder;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {

    List<ProductOrder> findAllById(Long id);
}
