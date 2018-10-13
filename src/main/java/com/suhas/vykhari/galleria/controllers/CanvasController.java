package com.suhas.vykhari.galleria.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suhas.vykhari.galleria.models.Canvas;

@RestController
public class CanvasController {
	
	@RequestMapping("/canvas")
	public List<Canvas> getAllCanvas(){
		return new ArrayList<>();
	}
	
	@RequestMapping("/canvas/{id}")
	public Canvas getAllCanvas(@PathVariable String id){
		return new Canvas();
	}
}