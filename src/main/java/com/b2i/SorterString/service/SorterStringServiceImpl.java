package com.b2i.SorterString.service;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

import com.b2i.SorterString.model.SorterString;

@Service("sorterStringService")
public class SorterStringServiceImpl implements SorterStringService {

	@Override
	public SorterString convertString(String value) {
		SorterString sorterString = new SorterString();

		sorterString.setContent(sorter(value));

		return sorterString;
	}

	private String sorter(String str) {
		Set<String> set = new TreeSet<String>();
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			set.add(Character.toString(str.charAt(i)));
		}

		for (String element : set) {
			stringBuilder = stringBuilder.append(element);
		}
		return stringBuilder.toString();
	}

}
