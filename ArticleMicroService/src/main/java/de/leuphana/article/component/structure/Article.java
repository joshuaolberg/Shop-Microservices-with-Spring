package de.leuphana.article.component.structure;

import de.leuphana.article.component.behaviour.ArticleService;

public class Article implements ArticleService {

	private int articleId;

	private String name;
	private String manufactor;
	private float price;

	private ArticleDescription articleDescription;

	public Article() {

	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setManufactor(String manufactor) {
		this.manufactor = manufactor;
	}

	public String getManufactor() {
		return manufactor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setArticleDescription(ArticleDescription articleDescription) {
		this.articleDescription = articleDescription;
	}

	public ArticleDescription getArticleDescription() {
		return articleDescription;
	}

}