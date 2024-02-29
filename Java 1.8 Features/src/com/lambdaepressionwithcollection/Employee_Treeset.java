package com.lambdaepressionwithcollection;
//using comparator
public class Employee_Treeset {
	private int Id;
	private String Name;
	private String Address;
	private double salary;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee_Treeset [Id=" + Id + ", Name=" + Name + ", Address=" + Address + ", salary=" + salary + "]";
	}
	
	

}
