package de.leuphana.customer.connector;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ordermicroservice")
public interface Customer2OrderConnectorRequester {

	@GetMapping("/list")
	public List<?> getOrders();
}
