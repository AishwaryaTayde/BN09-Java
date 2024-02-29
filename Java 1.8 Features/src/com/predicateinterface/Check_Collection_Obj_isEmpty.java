package com.predicateinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Check_Collection_Obj_isEmpty {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList();
		l.add("Ram");
		
		Predicate<List> p=s->s.isEmpty();
		System.out.println(p.test(l));
	}

}
