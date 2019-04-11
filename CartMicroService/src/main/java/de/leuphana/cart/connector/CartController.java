package de.leuphana.cart.connector;

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

import de.leuphana.cart.connector.entity.CartEntity;

@ComponentScan
@RestController
public class CartController {

	final Cart2ArticleConnectorRequester cart2ArticleConnectorRequester;

	@Autowired
	private CartJpaRepository cartJpaRepository;

	@Autowired
	public CartController(Cart2ArticleConnectorRequester cart2ArticleConnectorRequester) {
		this.cart2ArticleConnectorRequester = cart2ArticleConnectorRequester;
	}

	@GetMapping("/list")
	@ResponseBody
	public List<CartEntity> getCart() {

		return cartJpaRepository.findAll();
	}

//	 Optional, falls kein Customer gefunden wird.
	@RequestMapping("/{cartId}")
	@ResponseBody
	public Optional<CartEntity> getCart(@PathVariable("cartId") int cartId) {

		return cartJpaRepository.findById(cartId);
	}

	// Client to Server
	// POST über z.B. Postman Client
	@PostMapping("/cart")
	public CartEntity addCart(@RequestBody CartEntity cartEntity) {

		cartJpaRepository.save(cartEntity);

		return cartEntity;
	}

	@DeleteMapping("cart/{cartId}")
	public String deleteCart(@PathVariable int cartId) {

		CartEntity c = cartJpaRepository.getOne(cartId);
		cartJpaRepository.delete(c);

		return "deleted";
	}

	@PutMapping("/cart")
	public CartEntity updateCart(@RequestBody CartEntity cartEntity) {

		cartJpaRepository.save(cartEntity);

		return cartEntity;
	}

	/// CONNECTOR REQUESTER // SERVER TO CLIENT ///

	@GetMapping("/articles")
	public List<?> getArticles() {
		return cart2ArticleConnectorRequester.getArticles();
	}

}
