package com.lambdaExp;

public class practice {
	public static void main(String[] args) {
		
	
//	public void m1(int x,int y)
//	{
//		int z=x+y;
//		System.out.println(z);
//	}
		
//public void m1(int x,int y)
//{
//	System.out.println(x==y);
//	System.out.println(x&&y);
//	System.out.println(x||y);
//}
		
		
		
//using lambda Expression
	
//	Practice_Intrf i=(x,y)->
//	{
//		int z=x+y;
//		System.out.println(z);
//	};
//	i.m1(10, 20);
//	

Practice_Intrf i=(x,y)->
{
	System.out.println("Equal= "+(x==y));
	System.out.println("And= "+(x<y && x>y));
	System.out.println("OR="+ (x<y || x>y));
	System.out.println(x<y);
	System.out.println(x>y);
	System.out.println(x!=y);
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x/y);
	System.out.println(x*y);
};
i.m1(10, 20);

	}
	
}

