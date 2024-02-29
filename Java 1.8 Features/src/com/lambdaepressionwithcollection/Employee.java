package com.lambdaepressionwithcollection;
//using arraylist
public class Employee {
	private int Eid;
	private String Ename;
	private double Esalary;
	private String Eaddress;
	
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public double getEsalary() {
		return Esalary;
	}
	public void setEsalary(double esalary) {
		Esalary = esalary;
	}
	public String getEaddress() {
		return Eaddress;
	}
	public void setEaddress(String eaddress) {
		Eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "\n Eid=" + Eid + "\n Ename=" + Ename + "\n Esalary=" + Esalary + "\n Eaddress=" + Eaddress +"\n"  ;
	}
	
	

}
