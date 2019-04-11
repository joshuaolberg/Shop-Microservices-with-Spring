package de.leuphana.order.connector;

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
public class Order2ArticleConnectorRequesterTest {

	Order2ArticleConnectorRequester order2ArticleConnectorRequester;

	@Autowired
	private OrderController orderController;

	@Before
	public void setUp() throws Exception {
		orderController = new OrderController(order2ArticleConnectorRequester);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		List<?> articles = orderController.getArticles();
//		Assert.assertNotNull(articles);
	}

}
