package com.lambdaepressionwithcollection;

public class Address {
	private String EcityName;
	private double Epincode;
	
	public String getEcityName() {
		return EcityName;
	}
	public void setEcityName(String ecityName) {
		EcityName = ecityName;
	}
	public double getEpincode() {
		return Epincode;
	}
	public void setEpincode(double epincode) {
		Epincode = epincode;
	}
	@Override
	public String toString() {
		return "EcityName=" + EcityName + "\n" +" Epincode=" + Epincode +"\n" ;
	}
	

}
