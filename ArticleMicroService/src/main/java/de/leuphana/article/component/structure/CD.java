package de.leuphana.article.component.structure;

import de.leuphana.article.connector.entity.ArticleEntity;

public class CD extends ArticleEntity {

	private String artist;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}