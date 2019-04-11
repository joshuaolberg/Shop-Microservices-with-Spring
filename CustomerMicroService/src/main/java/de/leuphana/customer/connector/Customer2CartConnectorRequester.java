package de.leuphana.customer.connector;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cartmicroservice")
public interface Customer2CartConnectorRequester {

	@GetMapping("/list")
	public List<?> getCart();
}
