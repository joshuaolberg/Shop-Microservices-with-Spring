package de.leuphana.article.connector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.leuphana.article.connector.entity.ArticleEntity;

@ComponentScan
@RestController
public class ArticleController {

	@Autowired
	private ArticleJpaRepository articleJpaRepository;

	@GetMapping("/list")
	@ResponseBody
	public List<ArticleEntity> getArticles() {

		return articleJpaRepository.findAll();
	}

	// Optional, falls kein Customer gefunden wird.
	@RequestMapping("/{articleId}")
	@ResponseBody
	public Optional<ArticleEntity> getArticle(@PathVariable("articleId") int articleId) {

		return articleJpaRepository.findById(articleId);
	}

	// Client to Server
	// POST über z.B. Postman Client
	@PostMapping("/article")
	public ArticleEntity addArticle(@RequestBody ArticleEntity article) {

		articleJpaRepository.save(article);

		return article;
	}

	@DeleteMapping("article/{articleId}")
	public String deleteArticle(@PathVariable int articleId) {

		ArticleEntity a = articleJpaRepository.getOne(articleId);
		articleJpaRepository.delete(a);

		return "deleted";
	}

	@PutMapping("/customer")
	public ArticleEntity updateArticle(@RequestBody ArticleEntity article) {

		articleJpaRepository.save(article);

		return article;
	}
}
