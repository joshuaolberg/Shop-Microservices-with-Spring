package de.leuphana.order.connector;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ordermicroservice")
public interface Order2ArticleConnectorRequester {

	@GetMapping("/list")
	public List<?> getArticles();

}
