package com.b2i.SorterString.service;

import org.springframework.stereotype.Service;

import com.b2i.SorterString.model.SorterString;

@Service
public interface SorterStringService {
	
	public SorterString convertString(String value);
}
