
package com.predicateinterface;

import java.util.function.Predicate;

public class Check_number_isEven {
	public static void main(String[] args) {
		Integer x=9;
		Predicate<Integer> p=i->(i%2==0);
		
		if(p.test(x))
		{
			System.out.println(x);
		}
		else
		{
			System.out.println("given number is odd");
		}
	}

}
