package de.leuphana.customer.connector;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.leuphana.customer.connector.entity.CustomerEntity;

public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Integer> {

	List<CustomerEntity> findByName(String name);

	List<CustomerEntity> findByAddress(String address);

}
