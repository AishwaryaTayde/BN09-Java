package com.lambdaExp;

public class Demo {
	public static void main(String[] args) {
//		Intrf i=()-> System.out.println("hello java");
//		i.m1();
		
//		Intrf i=(x,y)->System.out.println("Add of x and y="+(x+y));
//		i.m1(10, 40);
		
		
//		Intrf i=z ->System.out.println(z*z);
//		i.m1(12);
		
//		Intrf i=x -> x*x;
//		System.out.println(i.m1(2));
		//or
		Intrf i=x->
		{
			System.out.println("Helo java");
			return 10;
			
		};
		System.out.println(i.m1(1));//using print statement we get return also(call method outside curli brace )
		
	}
 
}
