package com.b2i.SorterString.controller;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.b2i.SorterString.model.SorterString;
import com.b2i.SorterString.service.SorterStringService;

@RestController
@Validated
public class SorterStringController {
	
	@Autowired
	private SorterStringService sorterStringService;
	
	
	@GetMapping(value = "stringDedup")
	public SorterString getSorterString(@RequestParam("value") @Size(max = 30 , message = "the String should be less than 30") String value) {
		return sorterStringService.convertString(value);
	}
	
	}
