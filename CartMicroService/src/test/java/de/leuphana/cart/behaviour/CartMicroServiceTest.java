package de.leuphana.cart.behaviour;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.cart.connector.CartController;
import de.leuphana.cart.connector.entity.CartEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartMicroServiceTest {
	
	@Autowired 
	private CartController cartController;
	
	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<CartEntity> cart = cartController.getCart();
		Assert.assertNotNull(cart);
	}

}
