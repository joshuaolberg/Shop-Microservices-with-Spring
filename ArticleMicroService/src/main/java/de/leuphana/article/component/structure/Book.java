package de.leuphana.article.component.structure;

import de.leuphana.article.connector.entity.ArticleEntity;

public class Book extends ArticleEntity {

	private String author;
	private BookCategory bookCategory;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}

}