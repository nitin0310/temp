package com.automobile.FourWheeler;

public class Ford extends com.automobile.Vehicle{
	int speed;
	int tempControl;
	String mName;
	String rNumber;
	String oName;
	
	public Ford(int speed,int tempControl,String mName,String rNumber,String oName){
		this.speed=speed;
		this.tempControl=tempControl;
		this.mName=mName;
		this.rNumber=rNumber;
		this.oName=oName;
	}
	
	public int speed(){
		return speed;
	}

	public int tempControl() {
		return tempControl;
	}

	@Override
	public String getModelName() {
		
		return mName;
	}

	@Override
	public String getRegistrationNumber() {
		
		return rNumber;
	}

	@Override
	public String getOwnerName() {
		
		return oName;
	}
}
