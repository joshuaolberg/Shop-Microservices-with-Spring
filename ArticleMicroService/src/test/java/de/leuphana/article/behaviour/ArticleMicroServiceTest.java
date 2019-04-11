package de.leuphana.article.behaviour;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.article.connector.ArticleController;
import de.leuphana.article.connector.entity.ArticleEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMicroServiceTest {

	@Autowired
	private ArticleController articleController;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		List<ArticleEntity> articles = articleController.getArticles();
		Assert.assertNotNull(articles);

	}

}
