package com.lambdaexpwithmultithreading;

public class SyncMethod {
	public synchronized void mul(int n)
	{
	
		System.out.println(n);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
