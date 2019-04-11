package de.leuphana.cart.connector;


import org.springframework.data.jpa.repository.JpaRepository;

import de.leuphana.cart.connector.entity.CartEntity;

public interface CartJpaRepository extends JpaRepository<CartEntity, Integer> {
	

}
