package com.lambdaepressionwithcollection;

import java.util.Comparator;
import java.util.TreeSet;
//using comparator
public class TreesetWithStringBuffer {
	public static void main(String[] args) {
		Comparator  r=(obj1,obj2)-> obj1.toString().compareTo(obj2.toString());//Alphabetical order
		//Comparator  r=(obj1,obj2)-> -obj1.toString().compareTo(obj2.toString());//Reverse Alphabetical order
		
		TreeSet t=new TreeSet(r);
		t.add(new StringBuffer("Om"));
		t.add(new StringBuffer("Akash"));
		t.add(new StringBuffer("Pritam"));
		System.out.println(t);
		
		//Comparator<Integer> r1=(obj1,obj2)-> obj1-obj2;//Asscending
		Comparator<Integer> r1=(obj1,obj2)-> (obj1<obj2)?-1:(obj1>obj2)?1:0;//asscending
		//Comparator<Integer> r1=(obj1,obj2)-> (obj1<obj2)?1:(obj1>obj2)?-1:0;//Descending
		TreeSet<Integer> t1=new TreeSet(r1);
		t1.add(10);
		t1.add(4);
		t1.add(9);
		System.out.println(t1);
		
		
		
		
		
		
		
	}

}
