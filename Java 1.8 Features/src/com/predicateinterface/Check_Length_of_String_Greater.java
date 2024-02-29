package com.predicateinterface;

import java.util.function.Predicate;

public class Check_Length_of_String_Greater {
	public static void main(String[] args) {
		Predicate<String> p=s->s.length()>3;
		System.out.println(p.test("Ram"));
		System.out.println(p.test("Ashok"));
	}

}
