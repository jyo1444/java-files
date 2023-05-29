package com.automobile.fourwheeler;

public class Logan extends com.automobile.Vehicle {

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Logan";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "AP2345";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Akki";
	}
	public int speed() {
		return 90;
	}
	public int gps() {
		System.out.println("Control gps device");
		return 0;
	}
	
}
