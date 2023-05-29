package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Honda extends com.automobile.Vehicle{
	public int getSpeed() {
		return 80;
	}
	public void cdPlayer() {
		System.out.println("Control the cd player");
	}
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Honda";
	}
	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "AP1234";
	}
	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Jyotendra";
	}
}
