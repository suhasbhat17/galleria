package com.vykhari.galleria.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vykhari.galleria.models.Canvas;
import com.vykhari.galleria.service.CanvasService;

/**
 * Controller for Canvas.
 * 
 * @author Suhas Srinivasa Bhat
 *
 */
@RestController
public class CanvasController {

	@Autowired
	CanvasService canvasService;

	@RequestMapping("/canvas")
	public Canvas getCanvas() throws IOException {
		return canvasService.getCanvas();
	}

	@RequestMapping(value = "/sid", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<InputStreamResource> getImage() throws IOException {
		ClassPathResource imgFile = new ClassPathResource("static/IMG_6409.jpg");

		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG)
				.body(new InputStreamResource(imgFile.getInputStream()));
	}

}
