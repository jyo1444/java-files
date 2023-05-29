package com.automobile.fourwheeler;

public class Ford extends com.automobile.Vehicle {

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Ford";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "AP3456";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "raju";
	}
	public int speed() {
		return 100;
	}
	public int tempControl() {
		System.out.println("Control of AC device");
		return 0;
	}
}
