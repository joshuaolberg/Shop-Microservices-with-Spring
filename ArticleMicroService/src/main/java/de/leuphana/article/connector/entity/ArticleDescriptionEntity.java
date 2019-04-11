package de.leuphana.article.connector.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLE_DESCRIPTION")
public class ArticleDescriptionEntity {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int articleDescriptionId;

	private String text;
	private String author;

	public ArticleDescriptionEntity() {
	}

	public void setArticleDescriptionId(int articleDescriptionId) {
		this.articleDescriptionId = articleDescriptionId;
	}

	public int getArticleDescriptionId() {
		return articleDescriptionId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}