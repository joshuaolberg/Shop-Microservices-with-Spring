package de.leuphana.order.connector;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.leuphana.order.connector.entity.OrderEntity;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, Integer> {

	List<OrderEntity> findByOrderId(int id);

}