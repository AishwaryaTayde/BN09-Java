package com.consumer;

import java.util.function.Consumer;

public class Demo {
	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("Hello Java");
		c.accept("Welcome");//get input and process on it
		
		Consumer<Integer> c1=s1->System.out.println(s1);
		c1.accept(1+2);
		c1.accept(1*2);
		
		Consumer<Boolean> c2=s2->System.out.println(s2);
		c2.accept(1<2);
		c2.accept(3<2);
		c2.accept(3==3);
		c2.accept(3!=0);
		c2.accept(3==0);
		
		Consumer<Integer> c3=i->System.out.println(i*2);
		c3.accept(10);
	}

}
