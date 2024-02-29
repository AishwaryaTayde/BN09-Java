package com.sstream.treeset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreesetWithStream {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet();// same operation like as hashset
//		List<Integer> t=new ArrayList();
		t.add(10);
		t.add(13);
		t.add(4);
		t.add(8);
		t.add(15);
		t.add(10);
		//System.out.println(t);//no need to use other method  for default sort by default it give asecending for number and alhabetical for Character
		
		//Customize sorting using stream with TreeSet
		
		Set<Integer> t1 = t.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toCollection(TreeSet::new));
		Set<Integer> t2 = t.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toSet());
		System.out.println("t1: "+t1);
		System.out.println("t2: "+t2);
		
		
//		Set<Integer> t1 = t.stream().filter(i->i%2==0).collect(Collectors.toSet());// find even
//		System.out.println("t1 with filter: "+t1);
//		
//		Set<Integer> t2 = t.stream().filter(i->i<5).collect(Collectors.toSet());// no. less than 5
//		System.out.println("t2 with filter: "+t2);
//		
//		Set<Integer> t3 = t.stream().map(i->i+5).collect(Collectors.toSet());// add 5 in each no.
//		System.out.println("t3 with map: "+t3);//duplicate removed
		
		

		
	}

}
