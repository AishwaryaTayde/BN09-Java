package com.lambdaepressionwithcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class LambdaExpWithDefaultNaturalSorting {
	public static void main(String[] args) {
//		TreeSet<String> t=new TreeSet((obj1,obj2)->-1);//comparator(reverse of insertion order)
//		t.add("Jay");
//		t.add("Amol");
//		t.add("Ravi");
//		System.out.println(t);
		
		
		
		Student_DefaultSort s=new Student_DefaultSort();
		s.setId(101);
		s.setName("jay");
		
		Student_DefaultSort s1=new Student_DefaultSort();
		s1.setId(100);
		s1.setName("Amol");
		
		
		
		Comparable r=(obj1)->1;
		
		TreeSet t=new TreeSet();
		t.add(s);
		t.add(s1);
		System.out.println(t);
	
//		Comparable r=obj1 -> obj1.toString();
//		
//		TreeSet t=new TreeSet();
//		t.add(new StringBuffer("Jay"));
//		t.add(new StringBuffer("Amol"));
//		t.add(new StringBuffer("Rakesh"));
//		t.add(new StringBuffer("Bharat"));
//		System.out.println(t);
		
	
	 
	}

}
