package com.lambdaExp;

public class LambdaExpWithMultithreading {
	public static void main(String[] args) {
		
		Runnable r=()->
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("Child Thread");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=3;i++)
		{
			System.out.println("Main Thread");
		}
		
	}

}
