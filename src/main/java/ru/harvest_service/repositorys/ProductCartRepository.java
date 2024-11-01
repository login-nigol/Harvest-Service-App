package ru.harvest_service.repositorys;

import ru.harvest_service.entitys.ProductCart;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ProductCartRepository extends JpaRepository<ProductCart, Long> {

    List<ProductCart> findAllByProductCartId(Long productId);
}
