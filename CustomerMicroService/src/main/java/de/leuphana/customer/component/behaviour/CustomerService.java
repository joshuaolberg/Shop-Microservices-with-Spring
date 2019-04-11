package de.leuphana.customer.component.behaviour;

public interface CustomerService {

	int getCustomerId();

	void setCustomerId(int customerId);

	String getName();

	void setName(String name);

	String getAddress();

	void setAddress(String address);

	int getCartId();

	void addOrderId(int orderId);

}
