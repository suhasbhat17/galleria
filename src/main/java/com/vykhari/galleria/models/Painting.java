package com.vykhari.galleria.models;

import org.springframework.http.MediaType;

/**
 * Model class for Painting.
 * 
 * @author Suhas Srinivasa Bhat
 *
 */
public class Painting {

	private String paintingId;
	private PaintingType paintingType;
	private String title;
	private String description;
	private String imageUrl;

	public Painting() {
	}

	public Painting(String paintingId, PaintingType paintingType, String title, String description,String imageUrl) {
		this.paintingId = paintingId;
		this.paintingType = paintingType;
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
		
	}

	public String getPaintingId() {
		return paintingId;
	}

	public PaintingType getPaintingType() {
		return paintingType;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getImageUrl() {
		return imageUrl;
	}


}
