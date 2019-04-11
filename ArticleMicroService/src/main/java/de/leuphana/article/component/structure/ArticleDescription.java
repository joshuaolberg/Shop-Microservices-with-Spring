package de.leuphana.article.component.structure;

public class ArticleDescription {

	private int articleDescriptionId;

	private String text;
	private String author;

	public ArticleDescription() {
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