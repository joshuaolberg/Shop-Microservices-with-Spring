package de.leuphana.cart.component.behaviour;

import java.util.Collection;

import de.leuphana.cart.component.structure.CartItem;

public interface CartService {

	int getCartId();

	void setCartId(int cartId);

	void addCartItem(int articleId);

	void deleteCartItem(int articleId);

	void decrementArticleQuantity(Integer articleId);

	Collection<CartItem> getCartItems();

	int getNumberOfArticles();

}
