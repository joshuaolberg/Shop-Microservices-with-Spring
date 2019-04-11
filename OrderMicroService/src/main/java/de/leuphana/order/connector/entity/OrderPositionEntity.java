package de.leuphana.order.connector.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_POSITIONS")
public class OrderPositionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int positionId;
	private int articleId;
	private int articleQuantity;

	public OrderPositionEntity() {
	}

	public OrderPositionEntity(int positionId) {
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