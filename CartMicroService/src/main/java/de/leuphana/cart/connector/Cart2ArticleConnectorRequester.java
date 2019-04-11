package de.leuphana.cart.connector;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("articlemicroservice")
public interface Cart2ArticleConnectorRequester {
	
	@GetMapping("/list")
	public List<?> getArticles();

}
