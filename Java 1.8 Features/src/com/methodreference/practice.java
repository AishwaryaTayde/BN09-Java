package com.methodreference;

import java.util.function.Predicate;

public class practice {
	
	public boolean m1(int x)
	{
	
		System.out.println(x%2==0);
		return true;
	}
	
	public static void main(String[] args) {
		practice p=new practice();
		Predicate<Integer> pp=p::m1;
		System.out.println(pp.test(10));
	}

}
