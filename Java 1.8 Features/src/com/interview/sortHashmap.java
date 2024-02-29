package com.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class sortHashmap {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		m.put("a", 4);
		m.put("b", 2);
		m.put("c", 1);
		m.put("d", 3);
		
		System.out.println(m);
		
		LinkedHashMap<String, Integer> map = m.entrySet().stream().sorted((e1,e2)->
		{
			return e1.getValue().compareTo(e2.getValue());
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(map);
	}

}

//to sort hashmap use
//collect(colletors.tomap(keymapper, valuemapper, merge function, map supplier)
//merge function=whenever there are same key then at that time what we have to do i.e take onle one key
//like(e1,e2)-> e1 take only e1

//supplier=it will create new empty map and passing all sorted values to that
