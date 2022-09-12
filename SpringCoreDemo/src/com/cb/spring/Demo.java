package com.cb.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo 
{
	private String title;
	private List<Float> numbers;
	private Set<String> names;
	private Map<String, Integer> maps;
	
	public Demo(String title, List<Float> numbers,Set<String> names,Map<String, Integer> maps) {
		super();
		this.title = title;
		this.numbers = numbers;
		this.names = names;
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "Demo [title=" + title + ", numbers=" + numbers + ", names=" + names + ", maps=" + maps + "]";
	}

	
}
