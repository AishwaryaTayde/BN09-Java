package com.lambdaepressionwithcollection;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
//using comparator
public class EmployeeMain_Treeset {
	public static void main(String[] args) {
		
                TreeSet<Employee_Treeset> l=null;

				Scanner sc = new Scanner(System.in);
				while (true) {
					System.out.println();
					System.out.println("Collections object sort with customized sorting using Lambda Expression");
					System.out.println("Select below option \n1. Sort Id \n2. Sort Name \n3. Sort Address  \n4. Sort Salary");
					int x = sc.nextInt();
					switch (x) {
					case 1:
						Comparator<Employee_Treeset> c = (obj1, obj2) -> obj1.getId() - obj2.getId();
						l=new TreeSet(c);
						break;

					case 2:
						Comparator<Employee_Treeset> c1 = (obj1, obj2) -> obj1.getName().compareTo(obj2.getName());
						l=new TreeSet(c1);
						
						break;

					case 3:
						Comparator<Employee_Treeset> c2 = (obj1, obj2) -> obj1.getAddress().compareTo(obj2.getAddress());
						l=new TreeSet(c2);
						
						break;

					case 4:
						Comparator<Employee_Treeset> c3 = (obj1, obj2) -> 
						(obj1.getSalary()<obj2.getSalary()) ?-1:(obj1.getSalary()>obj2.getSalary())?1:0;
						l=new TreeSet(c3);
						System.out.println(l);

					}
					Employee_Treeset e1 = new Employee_Treeset();
					e1.setId(103);
					e1.setName("Akash");
					e1.setAddress("Pune");
					e1.setSalary(35000);

					Employee_Treeset e2 = new Employee_Treeset();
					e2.setId(102);
					e2.setName("Rakesh");
					e2.setAddress("Nashik");
					e2.setSalary(15000);
					
					Employee_Treeset e3 = new Employee_Treeset();
					e3.setId(104);
					e3.setName("Amol");
					e3.setAddress("Delhi");
					e3.setSalary(25000);

					Employee_Treeset e4 = new Employee_Treeset();
					e4.setId(101);
					e4.setName("Vicky");
					e4.setAddress("Mumbai");
					e4.setSalary(20000);
					
					l.add(e1);
					l.add(e2);
					l.add(e3);
					l.add(e4);
					
					for(Employee_Treeset t:l)
					{
						System.out.println(t);
					}

				}

			}

}

