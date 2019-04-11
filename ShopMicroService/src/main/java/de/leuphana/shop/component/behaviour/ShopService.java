package de.leuphana.shop.component.behaviour;

public interface ShopService {

	Integer createCustomerWithCart();

	// Article getArticle(int articleId);

	// Set<Article> getArticles();

	void removeArticleFromCart(Integer customerId, int articleId);

	void addArticleToCart(Integer customerId, Integer articleId);

	void decrementArticleQuantityInCart(Integer customerId, Integer articleId);

	// Order checkOutCart(int customerId);

	// Cart getCartForCustomer(Integer customerId);
}
