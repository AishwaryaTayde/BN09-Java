package com.predicateinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Check_even_number_fromCollection {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 16, 17, 19, 20, 24);// convert array to collection																								
		System.out.println(l);
		System.out.println("\n_________even numbers_________\n");

		Predicate<Integer> p = m -> (m % 2 == 0);
//		System.out.println(p.test(10));

		for (Integer i : l)//for each loop to iterate collection objects
		{
			if (p.test(i)) {
				System.out.println("Even number = " + i);
			}
		}

		System.out.println("________________odd numbers______________\n");
		Predicate<Integer> p1 = m -> (m % 2 != 0);

		for (Integer i : l) {
			if (p1.test(i)) {
				System.out.println("Odd number = " + i);
			}
		}

	}
}
