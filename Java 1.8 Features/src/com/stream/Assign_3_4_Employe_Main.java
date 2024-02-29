package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_3_4_Employe_Main {
	public static void main(String[] args) {
		Employe e1=new Employe();
		e1.setId(101);
		e1.setName("Sachin");
		
		Employe e2=new Employe();
		e2.setId(102);
		e2.setName("Amol");
		
		Employe e3=new Employe();
		e3.setId(104);
		e3.setName("Ritesh");
		
		Employe e4=new Employe();
		e4.setId(106);
		e4.setName("Bharat");
		
		Employe e5=new Employe();
		e5.setId(105);
		e5.setName("Ram");
		
		Employe e6=new Employe();
		e6.setId(103);
		e6.setName("Mahesh");
		
		List<Employe> l=new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		System.out.println(l);
		
		System.out.println("\n__________3. Sort Employe using Id______________________\n");
		List<Employe> l1=l.stream().sorted((s1,s2)->s1.getId()-s2.getId()).collect(Collectors.toList());
		System.out.println(l1);
		
		
		
		System.out.println("\n__________4. Find Employe present or not 'Rahul & Ram'______________\n");
         boolean l2 = l.stream().anyMatch(i->i.getName().contains("Rahul"));
         System.out.println("Rahul contains in list: "+l2);
         
         boolean l3 = l.stream().anyMatch(i->i.getName().contains("Ram"));
         System.out.println("Ram contains in list: "+l3);
	}

}
