package de.leuphana.cart.component.structure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import de.leuphana.cart.component.behaviour.CartService;

public class Cart implements CartService {

	private int cartId;

	private Map<Integer, CartItem> cartItems;

	private int numberOfArticles;

	public Cart() {
		cartItems = new HashMap<Integer, CartItem>();
		numberOfArticles = 0;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public void addCartItem(int articleId) {

		CartItem cartItem;
		if (cartItems.containsKey(articleId)) {
			cartItem = cartItems.get(articleId);
			cartItem.incrementQuantity();
		} else {
			cartItem = new CartItem();
			cartItems.put(articleId, cartItem);
		}
		numberOfArticles++;
	}

	// Turan
	public void deleteCartItem(int articleId) {
		for (CartItem cartItem : cartItems.values()) {
			if (cartItem.getArticleId() == (articleId)) {
				cartItems.remove(cartItem.getCartItemId());
				break;
			}
		}
	}

	public void decrementArticleQuantity(Integer articleId) {
		if (cartItems.containsKey(articleId)) {
			CartItem cartItem = (CartItem) cartItems.get(articleId);
			cartItem.decrementQuantity();

			if (cartItem.getQuantity() <= 0)
				cartItems.remove(articleId);

			numberOfArticles--;
		}
	}

	public Collection<CartItem> getCartItems() {
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