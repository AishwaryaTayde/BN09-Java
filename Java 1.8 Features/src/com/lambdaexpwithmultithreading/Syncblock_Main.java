package com.lambdaexpwithmultithreading;
// at atime only use only one type object to get lock that is make only sync for particular object or class level lock
public class Syncblock_Main {
	public static void main(String[] args) {
		SyncBlock s=new SyncBlock();
		
		Runnable r=()->
		{
			synchronized(s)//get particular object level lock
			{
				s.printTable(2);
			}
		};
		
		Runnable r1=()->
		{
			synchronized(SyncBlock.class)//get class level lock
			{
				s.printTable(4);
			}
		};
		
		Runnable r2=()->s.printTable(6);
		
		new Thread(r).start();
		new Thread(r1).start();
		new Thread(r2).start();
	}
	

}
