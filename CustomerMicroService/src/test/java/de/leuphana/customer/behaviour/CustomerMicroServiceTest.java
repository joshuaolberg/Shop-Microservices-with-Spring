package de.leuphana.customer.behaviour;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.customer.connector.CustomerController;
import de.leuphana.customer.connector.entity.CustomerEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerMicroServiceTest {

	@Autowired
	private CustomerController customerController;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<CustomerEntity> customer = customerController.getCustomers();
		Assert.assertNotNull(customer);
	}

}
