package de.leuphana.order.component.behaviour;

import java.util.Map;

import de.leuphana.order.component.structure.OrderPosition;

public interface OrderService {

	int getCustomerId();

	void setCustomerId(int customerId);

	int getOrderId();

	Map<Integer, OrderPosition> getOrderPositions();

	void addOrderPosition(OrderPosition orderPositions);

}
