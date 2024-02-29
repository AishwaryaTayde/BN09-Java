package com.lambdaexpwithmultithreading;

public class SyncMethod_Main {
	public static void main(String[] args) {

//		SyncMethod s = new SyncMethod();
//
//		SyncMethodRun s1 = new SyncMethodRun(s, 10);
//		SyncMethodRun s2 = new SyncMethodRun(s, 11);
//
//		Thread t1 = new Thread(s1);// create thread object and pass runable reference
//		Thread t2 = new Thread(s2);
//
//		t1.start();// call start method using thread object
//		t2.start();
		// or
//	new Thread(s1).start();//Create thread class ans pass runable referance and call start()
//	new Thread(s2).start();

		
		//using Lambda Expression
		SyncMethod s=new SyncMethod();
		
		Runnable r=()-> s.mul(10);
		Runnable r1=()-> s.mul(11);
		
//		Thread t1=new Thread(r);
//		Thread t2=new Thread(r1);
//		t1.start();
//	    t2.start();
	    
       //or
	    
	    new Thread(r).start();
	    new Thread(r1).start();
	}

}
