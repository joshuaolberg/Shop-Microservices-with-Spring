package de.leuphana.shop.connector;

import org.springframework.data.jpa.repository.JpaRepository;

import de.leuphana.shop.connector.entity.ShopEntity;

public interface ShopJpaRepository extends JpaRepository<ShopEntity, Integer>{

}
