package com.sstream.treeset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
//		TreeSet<String> t=new TreeSet();// same operation like as hashset
		HashSet<String> t=new HashSet();// same operation like as treeset
		t.add("Rani");
		t.add("Amol");
		t.add("Pawan");
		t.add("Payal");
		t.add("Om");
		t.add("Ram");
		
		Set<String> t1 = t.stream().filter(i->i.length()<4).collect(Collectors.toSet());
		System.out.println(t1);
		
				
		
	}

}
