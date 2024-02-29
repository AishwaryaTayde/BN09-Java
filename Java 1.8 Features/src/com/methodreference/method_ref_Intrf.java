package com.methodreference;

public class method_ref_Intrf {
	
	public void add()
	{
		System.out.println(2+3);
	}
	
	public static void main(String[] args) {
		method_ref_Intrf m=new method_ref_Intrf();
		Intrf i=m::add;
		i.m1();
	}

}
