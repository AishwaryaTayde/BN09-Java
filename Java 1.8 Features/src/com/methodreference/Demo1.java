package com.methodreference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo1 {
	public boolean m1(int x)// for predicate
	{
		return x%2==0;
	}
	
	public int m2(String s)//for function
	{
	int a=s.length();
	return a;
	}
	
	public void m3(int y)//for consumer
	{
		System.out.println(y*2);
	}
	
	public int m4()
	{
		return 2*4;
	}
	
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		Predicate<Integer> p=d::m1;
		System.out.println(p.test(10));
		
		Function<String, Integer> f=d::m2;
		System.out.println(f.apply("Hello"));
		
		Consumer<Integer> c= d::m3;
		c.accept(10);
		
		Supplier<Integer> s= d::m4;
		System.out.println(s.get());
	}

}
