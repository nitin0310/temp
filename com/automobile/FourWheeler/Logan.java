package com.automobile.FourWheeler;

public class Logan extends com.automobile.Vehicle{
	int speed;
	int gps;
	String mName;
	String rNumber;
	String oName;
	
	public Logan(int speed,int gps,String mName,String rNumber,String oName){
		this.speed=speed;
		this.gps=gps;
		this.mName=mName;
		this.rNumber=rNumber;
		this.oName=oName;
	}
	
	public int speed(){
		return speed;
	}

	public int gps() {
		return gps;
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