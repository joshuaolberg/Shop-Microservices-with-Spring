package de.leuphana.article.connector;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.leuphana.article.connector.entity.ArticleEntity;

public interface ArticleJpaRepository extends JpaRepository<ArticleEntity, Integer> {
	List<ArticleEntity> findByName(String name);

	List<ArticleEntity> findByManufactor(String manufactor);

	List<ArticleEntity> findByPrice(float price);

}
