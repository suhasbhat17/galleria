package com.vykhari.galleria.models;

import java.util.List;

/**
 * Model class for Canvas.
 * 
 * @author Suhas Srinivasa Bhat
 *
 */
public class Canvas {

	private String canvasId;
	private List<Painting> paintings;

	public Canvas(String canvasId, List<Painting> paintings) {
		this.canvasId = canvasId;
		this.paintings = paintings;
	}

	public String getCanvasId() {
		return canvasId;
	}

	public List<Painting> getPaintings() {
		return paintings;
	}
}
