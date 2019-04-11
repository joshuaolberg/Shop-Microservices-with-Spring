package de.leuphana.article.connector.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLES")
public class ArticleEntity {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int articleId;

	private String name;
	private String manufactor;
	private float price;

	@ManyToOne
	@JoinColumn(name = "ARTICLE_DESCRIPTION_ID")
	private ArticleDescriptionEntity articleDescription;

	public ArticleEntity() {

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

	public void setArticleDescription(ArticleDescriptionEntity articleDescription) {
		this.articleDescription = articleDescription;
	}

	public ArticleDescriptionEntity getArticleDescription() {
		return articleDescription;
	}

}