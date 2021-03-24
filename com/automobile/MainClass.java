package com.automobile;
import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;

public class MainClass {
	public static void main(String[] args) {
		Logan logan = new Logan(40,5,"WETRFFH","049506","Vipul");
		System.out.println(logan.getModelName());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.speed());
		System.out.println(logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford(80,9,"YHTRFGH","047006","Kunal");
		System.out.println(ford.getModelName());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.speed());
		System.out.println(ford.tempControl());

	}
}
