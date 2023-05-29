package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends com.automobile.Vehicle {
	public String getModelName() {
		return "Hero";
	}
	public String getRegistrationNumber() {
		return "AP2304";
	}
	public String getOwnerName() {
		return "Jyo";
	}
	public int getSpeed() {
		return 65;
	}
	public void radio() {
		System.out.println("Control radio");
	}
}
