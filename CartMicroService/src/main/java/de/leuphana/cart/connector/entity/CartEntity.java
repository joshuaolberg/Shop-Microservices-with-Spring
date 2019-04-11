package de.leuphana.cart.connector.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CART")
public class CartEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;

	@ElementCollection
	private Map<Integer, CartItemEntity> cartItems;

	private int numberOfArticles;

	public CartEntity() {
		cartItems = new HashMap<Integer, CartItemEntity>();
		numberOfArticles = 0;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public void addCartItem(int articleId) {

		CartItemEntity cartItemEntity;
		if (cartItems.containsKey(articleId)) {
			cartItemEntity = cartItems.get(articleId);
			cartItemEntity.incrementQuantity();
		} else {
			cartItemEntity = new CartItemEntity(articleId);
			cartItems.put(articleId, cartItemEntity);
		}
		numberOfArticles++;
	}

	// Turan
	public void deleteCartItem(int articleId) {
		for (CartItemEntity cartItem : cartItems.values()) {
			if (cartItem.getArticleId() == (articleId)) {
				cartItems.remove(cartItem.getCartItemId());
				break;
			}
		}
	}

	public void decrementArticleQuantity(Integer articleId) {
		if (cartItems.containsKey(articleId)) {
			CartItemEntity cartItem = (CartItemEntity) cartItems.get(articleId);
			cartItem.decrementQuantity();

			if (cartItem.getQuantity() <= 0)
				cartItems.remove(articleId);

			numberOfArticles--;
		}
	}

	public Collection<CartItemEntity> getCartItems() {
		return cartItems.values();
	}

	public int getNumberOfArticles() {
		return numberOfArticles;
	}

	/*
	 * public int getArticleId() { return articleId; }
	 * 
	 * public void setArticleId(int articleId) { this.articleId = articleId; }
	 * 
	 */
	/*
	 * public double getTotalPrice() { double totalPrice = 0.0;
	 * 
	 * Article article; for (CartItemEntity cartItem : getCartItems()) { article =
	 * cartItem.getArticleId();
	 * 
	 * totalPrice += cartItem.getQuantity() * article.getPrice(); }
	 * 
	 * return totalPrice; }
	 */

	/*
	 * @Override public String toString() { return "CartItem [cartId=" + cartId +
	 * ", quantity=" + quantity + "]";
	 * 
	 * }
	 */
}