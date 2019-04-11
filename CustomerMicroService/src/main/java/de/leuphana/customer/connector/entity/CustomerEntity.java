package de.leuphana.customer.connector.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	private String name;
	private String address;

	@Column(name = "CART_ID")
	private int cartId;

//	private Map<Integer, Order> orders;

	@ElementCollection
	private List<Integer> orderIds;

	public CustomerEntity() {
	}

	public CustomerEntity(int cartId) {
		this.cartId = cartId;
		orderIds = new ArrayList<Integer>();
//		orders = new HashMap<Integer, Order>();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCartId() {
		return cartId;
	}

	public void addOrder(int orderId) {
//		orders.put(order.getOrderId(), order);
		orderIds.add(orderId);
	}

	public void addOrderId(int orderId) {
		orderIds.add(orderId);

	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + "]";

	}

}
