package com.suhas.galleria.galleria_app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.suhas.galleria_app.models.Canvas;

@RestController
public class CanvasController {
	
	public List<Canvas> getCanvas(){
		return new ArrayList<>();
	}
}
