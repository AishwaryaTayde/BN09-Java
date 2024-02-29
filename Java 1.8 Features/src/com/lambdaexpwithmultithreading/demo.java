package com.lambdaexpwithmultithreading;

public class demo {
	public static void main(String[] args) {
		Runnable r=()->
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("Child Thread");//child thread which implement runnable interface
			}
		};
		
		Thread t=new Thread(r);//thread call runnable interface which pass reference in thread obj
		t.start();
		for(int i=1;i<=3;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
