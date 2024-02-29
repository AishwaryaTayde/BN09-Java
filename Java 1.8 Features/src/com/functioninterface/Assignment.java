package com.functioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Assignment {
	public static void main(String[] args) {
		
		
		System.out.println("____1. Multiplication_______\n");
		
		Function<Integer,Integer> f=n->2*n;
		System.out.println(f.apply(10));//20
		System.out.println(f.apply(12));//24
		
		
		
		
        System.out.println("\n___2. Even odd Number__________\n");
        
		Function<Integer,String> f1=n->
		{
			if(n%2==0)
			{
				return "Number " +n+ " is even number";
			}
			else
			{
				return "Number " +n +" is odd number";
			}
		};
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(5));
//		
		
		
		
		System.out.println("\n_____3. String Length greater than 3________\n");
		
		Function<String, String> f3=a->
		{
			if(a.length()>3)
			{
				return "Length of "+a+ " is greater";
			}
			else
			{
				return a+" length not greater";
				
			}
		};
		System.out.println(f3.apply("Ramesh"));
		System.out.println(f3.apply("Ram"));
		
		
		
		
		System.out.println("\n____4.find length and multiply with any number_____\n");
		
		Function<String, Integer> f4=d->d.length()*2;
		System.out.println(f4.apply("Ram"));
		
		//
		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);


		Function<Integer, Integer> f5=i->2*i;
		for(Integer ll:l)
		{
			System.out.println(f5.apply(ll));
		}
		
	}

}
