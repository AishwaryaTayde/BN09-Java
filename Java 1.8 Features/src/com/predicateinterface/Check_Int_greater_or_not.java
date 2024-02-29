package com.predicateinterface;

import java.util.function.Predicate;

public class Check_Int_greater_or_not {
	public static boolean test(Integer i)
	{
		if(i>10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
	System.out.println(Check_Int_greater_or_not.test(10));
	System.out.println(Check_Int_greater_or_not.test(15));
	
	System.out.println("_____Using 1.8____________");
	
	Predicate<Integer> p=i->(i>10);
	
	System.out.println(p.test(10));
	System.out.println(p.test(11));
	}

}
