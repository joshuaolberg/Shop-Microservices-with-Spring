package de.leuphana.article.component.behaviour;

import de.leuphana.article.component.structure.ArticleDescription;

public interface ArticleService {

	void setArticleId(int articleId);

	int getArticleId();

	void setManufactor(String manufactor);

	String getManufactor();

	void setName(String name);

	String getName();

	void setPrice(float price);

	float getPrice();

	void setArticleDescription(ArticleDescription articleDescription);

	ArticleDescription getArticleDescription();

}
