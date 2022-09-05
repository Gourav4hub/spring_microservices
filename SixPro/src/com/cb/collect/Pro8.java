package com.cb.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Pro8 {

	public static void main(String[] args) {
		
		// Map
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("abc", 45);
		map.put("xyz", 21);
		map.put("qaw", 23);
		map.put("edr", 65);
		map.put("rde", 67);
		
		System.out.println(map);
		
		int x = map.get("xyz");
		System.out.println(x);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Collection<Integer> val1 =  map.values();
		System.out.println(val1);
		
		
	}

}
