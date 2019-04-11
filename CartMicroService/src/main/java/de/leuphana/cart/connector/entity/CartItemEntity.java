package de.leuphana.cart.connector.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CART_ITEMS")
public class CartItemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartItemId;

	@Column(name = "ARTICLE_ID")
	private int articleId;
	
	private int quantity;
	
	public CartItemEntity() {
		
	}

	public CartItemEntity(int articleId) {
		this.articleId = articleId;
		quantity = 1;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getArticleId() {
		return articleId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void incrementQuantity() {
		quantity++;
	}

	public void decrementQuantity() {
		quantity--;
	}

}