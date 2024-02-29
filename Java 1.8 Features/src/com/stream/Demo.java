package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(15);
		l.add(5);
		l.add(40);
		System.out.println(l);//[10, 20, 30, 15, 5, 40]
		
		//Before using 1.8
		List<Integer> l2=new ArrayList();
		for(Integer l3:l)
		{
			if(l3%2==0)
			{
				l2.add(l3);
			}
		}
		System.out.println(l2);//[10, 20, 30, 40]
		
		//Using 1.8 with stream API
		
		List<Integer> s1=l.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(s1);//[10, 20, 30, 40]
	}

}
