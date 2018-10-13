package com.suhas.vykhari.galleria.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.suhas.vykhari.galleria.models.Canvas;

@RestController
public class CanvasController {
	
	public List<Canvas> getCanvas(){
		return new ArrayList<>();
	}
}
