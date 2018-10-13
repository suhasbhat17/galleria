package com.vykhari.galleria.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import com.vykhari.galleria.models.Canvas;
import com.vykhari.galleria.models.Painting;
import com.vykhari.galleria.models.PaintingType;

@Service
public class CanvasService {

	public Canvas getCanvas() {
		
		Canvas canvas = new Canvas(getRandomID(), getPaintings());
		return canvas;
	}
	
	private String getRandomID() {
		return RandomStringUtils.randomAlphanumeric(10);
	}
	
	private List<Painting> getPaintings() {
		Painting waterColor = new Painting(getRandomID(), PaintingType.WATERCOLOR, "Still life of chintu", "Our greatest chintu kundilu","/images/IMG_6360.jpg");
		Painting oilColor = new Painting(getRandomID(), PaintingType.OILCOLOR, "OIL life of chintu", "Our afasfasd asdasd kundilu","/images/IMG_6409.jpg");
		
		List<Painting> paintingList = new ArrayList<>();
		paintingList.add(waterColor);
		paintingList.add(oilColor);
		return paintingList;
	}
	
	 public ResponseEntity<InputStreamResource> getImage() throws IOException {
		     
		 
	        ClassPathResource imgFile = new ClassPathResource("/images/IMG_6360.jpg");
	    //    ClassPathResource img = new ClassPathResource("/images/IMG_6360.jpg");
	   	 
	        return ResponseEntity
	                .ok()
	                .contentType(MediaType.IMAGE_JPEG)
	                .body(new InputStreamResource(imgFile.getInputStream()));
	    }

}
