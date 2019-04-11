package de.leuphana.order.behaviour;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.order.connector.OrderController;
import de.leuphana.order.connector.entity.OrderEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMicroServiceTest {

	@Autowired
	private OrderController orderController;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<OrderEntity> orders = orderController.getOrders();
		Assert.assertNotNull(orders);
	}

}
