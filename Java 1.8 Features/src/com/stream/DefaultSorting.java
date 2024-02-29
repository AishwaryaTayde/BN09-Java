package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultSorting {
public static void main(String[] args) {
	List<Integer> l = new ArrayList();
	l.add(10);
	l.add(70);
	l.add(30);
	l.add(20);
	l.add(50);
	
	List<Integer> l1=l.stream().sorted().collect(Collectors.toList());
	System.out.println(l1);
	
	
	
	//for customize sorting
	
	List<Integer> l2=l.stream().sorted((i1,i2)->-i1+i2).collect(Collectors.toList());
	System.out.println(l2);
	
	//find min value
	
	Integer l3=l.stream().min((i1,i2)->i1-i2).get();
	System.out.println(l3);
	
	//find max value
	
	Integer l4=l.stream().max((i1,i2)->i1-i2).get();
	System.out.println(l4);
}

}
