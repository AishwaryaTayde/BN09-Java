package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		List<String> l=new ArrayList();
		l.add("ram");
		l.add("ravi");
		
	System.out.println(l);
	
//	List<String> l1=new ArrayList();
//	for(String s1:l )
//	{
//		if(s1.length()<4)
//		{
//			l1.add(s1);
//		}
//	}
//	System.out.println(l1);	
//	}
	
	List<String> ll=l.stream().filter(i->i.length()<4).collect(Collectors.toList());
	System.out.println(ll);
	}
}
