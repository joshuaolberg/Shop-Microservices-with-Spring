package de.leuphana.shop.component.structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shop {
	private int catalogId;
	private int customerId;
	
	//private Map<customerId> customers;
	
	public Shop() {
		
	}
	
	
	public int getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/*public Shop() {
		customers = new HashMap<Integer, Customer>();
	}*/
	
	// Wie? - konkreter Teil

	/* (non-Javadoc)
	 * @see de.leuphana.shop.behaviour.ShopService#createCustomerWithCart()
	 */
	/*@Override
	public Integer createCustomerWithCart() {
		Cart cart = new Cart();

		Customer customer = new Customer(cart);

		customers.put(customer.getCustomerId(), customer);

		return customer.getCustomerId();
	}*/

	/* (non-Javadoc)
	 * @see de.leuphana.shop.behaviour.ShopService#getArticle(int)
	 */
	/*@Override
	public Article getArticle(int articleId) {
		// Delegation
		return catalog.getArticle(articleId);
	}*/

	/* (non-Javadoc)
	 * @see de.leuphana.shop.behaviour.ShopService#getArticles()
	 */
	/*@Override
	public Set<Article> getArticles() {
		return catalog.getArticles();
	}*/

	/* (non-Javadoc)
	 * @see de.leuphana.shop.behaviour.ShopService#removeArticleFromCart(java.lang.Integer, int)
	 */
	/*@Override
	public void removeArticleFromCart(Integer customerId, int articleId) {
		// Delegation
		Cart cart = customers.get(customerId).getCart();

		cart.deleteCartItem(articleId);
	}*/

	/* (non-Javadoc)
	 * @see de.leuphana.shop.behaviour.ShopService#addArticleToCart(java.lang.Integer, java.lang.Integer)
	 */
	/*@Override
	public void addArticleToCart(Integer customerId, Integer articleId) {
		Article foundArticle = getArticle(articleId);

		Cart cart = customers.get(customerId).getCart();

		cart.addCartItem(foundArticle);
	}*/

	/* (non-Javadoc)
	 * @see de.leuphana.shop.behaviour.ShopService#decrementArticleQuantityInCart(java.lang.Integer, java.lang.Integer)
	 */
	/*@Override
	public void decrementArticleQuantityInCart(Integer customerId,
			Integer articleId) {
		Cart cart = customers.get(customerId).getCart();

		cart.decrementArticleQuantity(articleId);
	}*/

	/* (non-Javadoc)
	 * @see de.leuphana.shop.behaviour.ShopService#checkOutCart(int)
	 */
	/*@Override
	public Order checkOutCart(int customerId) {

		Customer customer = customers.get(customerId);
		Cart cart = customer.getCart();

		Order order = new Order(1);

		int i = 1;

		for (CartItem cartItem : cart.getCartItems()) {
			OrderPosition orderPosition = new OrderPosition(i++);
			orderPosition.setArticle(cartItem.getArticle());
			orderPosition.setArticleQuantity(cartItem.getQuantity());
			order.addOrderPosition(orderPosition);
		}

		customer.addOrder(order);

		return order;
	}*/

	/* (non-Javadoc)
	 * @see de.leuphana.shop.behaviour.ShopService#getCartForCustomer(java.lang.Integer)
	 */
	/*@Override
	public Cart getCartForCustomer(Integer customerId) {
		return customers.get(customerId).getCart();
	}*/

}
