package com.lambdaepressionwithcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList();
		l.add(10);
		l.add(30);
		l.add(20);
		l.add(40);
		l.add(60);
		l.add(50);
		System.out.println(l);
		
	//	Comparator<Integer> c=(obj1,obj2)->(obj1<obj2)?-1:(obj1>obj2)?1:0;//Asscending order
		Comparator<Integer> c=(obj1,obj2)->(obj1<obj2)?1:(obj1>obj2)?-1:0;//Descending order
		
		Collections.sort(l, c);
		System.out.println(l);
		
		
		
	}

}
