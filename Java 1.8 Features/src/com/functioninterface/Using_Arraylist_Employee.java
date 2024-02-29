package com.functioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Using_Arraylist_Employee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Ram");
		
		Employee e2=new Employee();
		e2.setId(102);
		e2.setName("Sita");
		
		List<Employee> l=new ArrayList();
		l.add(e1);
		l.add(e2);
		
		//Get Name
		Function<Employee, String> f=s->s.getName();
		
		for(Employee list:l)
		{
			System.out.println(f.apply(list));
		}
		
		//Get Id
		System.out.println();
		Function<Employee, Integer> f1=s1->s1.getId();
		for(Employee list:l)
		{
			System.out.println(f1.apply(list));
		}
	}

}
