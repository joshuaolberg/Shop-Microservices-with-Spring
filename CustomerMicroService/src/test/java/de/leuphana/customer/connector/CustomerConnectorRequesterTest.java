package de.leuphana.customer.connector;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerConnectorRequesterTest {

	Customer2CartConnectorRequester customer2CartConnectorRequester;
	Customer2OrderConnectorRequester customer2OrderConnectorRequester;

	@Autowired
	private CustomerController customerController;

	@Before
	public void setUp() throws Exception {
		customerController = new CustomerController(customer2CartConnectorRequester, customer2OrderConnectorRequester);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCart() {
//		List<?> cart = customerController.getCart();
//		Assert.assertNotNull(cart);
	}

	@Test
	public void testOrder() {
//		List<?> orders = customerController.getOrders();
//		Assert.assertNotNull(orders);
	}

}
