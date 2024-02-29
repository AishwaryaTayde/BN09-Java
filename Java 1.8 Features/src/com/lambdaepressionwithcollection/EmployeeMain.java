package com.lambdaepressionwithcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//using arraylist
public class EmployeeMain {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setEid(103);
		e1.setEname("Akash");
		e1.setEaddress("Pune");
		e1.setEsalary(20000);

		Employee e2 = new Employee();
		e2.setEid(102);
		e2.setEname("Rakesh");
		e2.setEaddress("Nashik");
		e2.setEsalary(15000);

		Employee e3 = new Employee();
		e3.setEid(104);
		e3.setEname("Amol");
		e3.setEaddress("Mumbai");
		e3.setEsalary(35000);

		Employee e4 = new Employee();
		e4.setEid(101);
		e4.setEname("Vicky");
		e4.setEaddress("Delhi");
		e4.setEsalary(25000);

		ArrayList<Employee> l = new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("Collections object sort with customized sorting using Lambda Expression");
			System.out.println("Select below option \n1. Sort Id \n2. Sort Name \n3. Sort Address  \n4. Sort Salary");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				Comparator<Employee> c = (obj1, obj2) -> obj1.getEid() - obj2.getEid();
				Collections.sort(l, c);
				System.out.println(l);
				break;

			case 2:
				Comparator<Employee> c1 = (obj1, obj2) -> obj1.getEname().compareTo(obj2.getEname());
				Collections.sort(l, c1);
				System.out.println(l);
				break;

			case 3:
				Comparator<Employee> c2 = (obj1, obj2) -> obj1.getEaddress().compareTo(obj2.getEaddress());
				Collections.sort(l, c2);
				System.out.println(l);
				break;

			case 4:
				Comparator<Employee> c3 = (obj1, obj2) -> 
				(obj1.getEsalary()<obj2.getEsalary()) ?-1:(obj1.getEsalary()>obj2.getEsalary())?1:0;
				Collections.sort(l, c3);
				System.out.println(l);

			}

		}

	}

}
