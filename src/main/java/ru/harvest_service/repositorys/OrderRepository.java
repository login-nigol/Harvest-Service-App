package ru.harvest_service.repositorys;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.criteria.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    List<Order> findAllByOrderTitel(String orderTitle);
}
