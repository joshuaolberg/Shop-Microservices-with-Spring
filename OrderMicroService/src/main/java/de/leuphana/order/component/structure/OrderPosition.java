package de.leuphana.order.component.structure;

public class OrderPosition {

	private int positionId;
	private int articleId;
	private int articleQuantity;

	public OrderPosition(int positionId) {
		this.positionId = positionId;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	
	public int getArticleId() {
		return articleId;
	}

	public int getArticleQuantity() {
		return articleQuantity;
	}

	public void setArticleQuantity(int articleQuantity) {
		this.articleQuantity = articleQuantity;
	}

}