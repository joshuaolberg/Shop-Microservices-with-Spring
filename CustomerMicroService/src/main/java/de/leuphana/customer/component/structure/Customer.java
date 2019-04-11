package de.leuphana.customer.component.structure;

import java.util.List;

import de.leuphana.customer.component.behaviour.CustomerService;

public class Customer implements CustomerService {

	private int customerId;

	private String name;
	private String address;

	private int cartId;

	private List<Integer> orderIds;

	public Customer(int cartId) {
		this.cartId = cartId;
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

	public void addOrderId(int orderId) {
		orderIds.add(orderId);

	}

}
