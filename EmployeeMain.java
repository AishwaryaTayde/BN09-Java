package com.comparator;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeMain {
	public static void main(String[] args) {
		
			TreeSet<Employee> t=null;
			Scanner sc = new Scanner(System.in);
			while (true) {
			System.out.println();
			System.out.println("_______________________________________________________________________________________________");
			System.out.println("Enter your choice");
			System.out.println("1. Id sort \n2. Name Sort \n3. Salary Sort");
			int x = sc.nextInt();

			switch (x) {

			case 1:
				    t= new TreeSet<Employee>(new IdSortComparator());
				    break;
				    
			case 2: 
				 t= new TreeSet<Employee>(new NameSortComparator());
				break;
				
			case 3:
				 t= new TreeSet<Employee>(new SalarySortComparator());
				break;
	}
			

			Employee E = new Employee();
			E.seteid(101);
			E.seteName("Rahul");
			E.seteSalary(25000);

			Employee E2 = new Employee();
			E2.seteid(102);
			E2.seteName("Amol");
			E2.seteSalary(20000);

			Employee E3 = new Employee();
			E3.seteid(103);
			E3.seteName("Sachin");
			E3.seteSalary(30000);
			
			t.add(E);
			t.add(E2);
			t.add(E3);

			for (Employee emp : t) {
				System.out.println(emp.geteId());
				System.out.println(emp.geteName());
				System.out.println(emp.geteSalary());
				System.out.println();
				}
}
}
}
