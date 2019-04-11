package de.leuphana.order.connector.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private int customerId;

	@ElementCollection
	private Map<Integer, OrderPositionEntity> orderPositions;

	public OrderEntity() {
		orderPositions = new HashMap<Integer, OrderPositionEntity>();
	}

	public OrderEntity(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public Map<Integer, OrderPositionEntity> getOrderPositions() {
		return orderPositions;
	}

	public void addOrderPosition(OrderPositionEntity orderPosition) {
		orderPositions.put(orderPosition.getPositionId(), orderPosition);
	}

	public int getNumberOfArticles() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * public double getTotalPrice() { double totalPrice = 0.0;
	 * 
	 * Article article; for (OrderPosition orderPosition : orderPositions.values())
	 * { article = orderPosition.getArticle();
	 * 
	 * totalPrice += orderPosition.getArticleQuantity() * article.getPrice(); }
	 * 
	 * return totalPrice; }
	 */

}