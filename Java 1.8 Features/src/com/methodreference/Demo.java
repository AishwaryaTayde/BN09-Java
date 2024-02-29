package com.methodreference;

import java.util.function.Predicate;

public class Demo {
	
	public void m1()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
//		Runnable r=Demo::m1;// for static method
		
		Demo d=new Demo();
	    Runnable r=d::m1;
		Thread t=new Thread(r);
		t.start();
		
		
		for(int i=1;i<=2;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
