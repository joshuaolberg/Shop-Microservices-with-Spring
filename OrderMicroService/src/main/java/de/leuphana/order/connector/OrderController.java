package de.leuphana.order.connector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.leuphana.order.connector.entity.OrderEntity;

@ComponentScan
@RestController
public class OrderController {

	final Order2ArticleConnectorRequester order2ArticleConnectorRequester;

	@Autowired
	private OrderJpaRepository orderJpaRepository;

	@Autowired
	public OrderController(Order2ArticleConnectorRequester order2ArticleConnectorRequester) {
		this.order2ArticleConnectorRequester = order2ArticleConnectorRequester;

	}

	@GetMapping("/list")
	@ResponseBody
	public List<OrderEntity> getOrders() {

		return orderJpaRepository.findAll();
	}

	// Optional
	@RequestMapping("/{orderId}")
	@ResponseBody
	public Optional<OrderEntity> getOrder(@PathVariable("orderId") int orderId) {

		return orderJpaRepository.findById(orderId);
	}

	// Client to Server
	// POST über z.B. Postman Client
	@PostMapping("/order")
	public OrderEntity addOrder(@RequestBody OrderEntity orderEntity) {

		orderJpaRepository.save(orderEntity);

		return orderEntity;
	}

	@DeleteMapping("/order/{orderId}")
	public String deleteOrder(@PathVariable int orderId) {

		OrderEntity a = orderJpaRepository.getOne(orderId);
		orderJpaRepository.delete(a);

		return "deleted";
	}

	@PutMapping("/order")
	public OrderEntity updateOrder(@RequestBody OrderEntity orderEntity) {

		orderJpaRepository.save(orderEntity);

		return orderEntity;
	}

	/// CONNECTOR REQUESTER // SERVER TO CLIENT ///

	@GetMapping("/articles")
	public List<?> getArticles() {
		return order2ArticleConnectorRequester.getArticles();
	}

}
