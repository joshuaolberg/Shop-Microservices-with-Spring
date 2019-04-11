package de.leuphana.cart.connector;

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
public class Cart2ArticleConnectorRequesterTest {

	Cart2ArticleConnectorRequester cart2ArticleConnectorRequester;

	@Autowired
	private CartController cartController;

	@Before
	public void setUp() throws Exception {
		cartController = new CartController(cart2ArticleConnectorRequester);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		List<?> articles = cartController.getArticles();
//		Assert.assertNotNull(articles);
	}

}
