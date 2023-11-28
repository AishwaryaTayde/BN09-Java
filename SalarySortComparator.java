package com.comparator;

import java.util.Comparator;

public class SalarySortComparator implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		
		if(e1.geteSalary()<e2.geteSalary())
		{
			return -1;
		}
		else if(e1.geteSalary()>e2.geteSalary())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
