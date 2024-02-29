package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment_1_2 {
	public static void main(String[] args) {
		List<String> l = new ArrayList();
		l.add("Sachin");
		l.add("Amol");
		l.add("Mahesh");
		l.add("Ritesh");
		l.add("Ram");
		l.add("Bharat");

		System.out.println(l);

		System.out.println("\n____________1. Sort string alphbetically__________________\n");
		List<String> l1 = l.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(l1);

		System.out.println("\n____________2.sort String according to length_______________\n");
		List<String> l2 = l.stream().sorted((a1, a2) -> a1.length() - a2.length()).collect(Collectors.toList());
		System.out.println(l2);
	}

}
