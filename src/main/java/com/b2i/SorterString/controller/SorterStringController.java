package com.b2i.SorterString.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.b2i.SorterString.model.SorterString;
import com.b2i.SorterString.service.SorterStringService;

@RestController
public class SorterStringController {
	
	@Autowired
	private SorterStringService sorterStringService;
	
	
	@GetMapping(value = "SorterString/{value}")
	public SorterString getSorterString(@PathVariable String value) {
		return sorterStringService.convertString(value);
	}
	
	}
