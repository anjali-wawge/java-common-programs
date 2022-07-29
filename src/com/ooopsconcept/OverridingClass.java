package com.ooopsconcept;
class Vehicle {
	Vehicle(){
		System.out.println("Vehicle constructor");
	}
	Vehicle(String a){
		System.out.println(a);
	}
	void typeOfvehicle(int speed,int time) {
		int dist=speed*time;
		System.out.println("Vehicle method"+dist);
	}
}
class ChargingVehicle extends Vehicle{
	
	@Override
	void typeOfvehicle(int speed,int time) {
		int dist=speed*time;
		System.out.println("Override method"+dist);
	}
}

public class OverridingClass {

	public static void main(String[] args) {
		ChargingVehicle cv=new ChargingVehicle();
		//cv.typeOfvehicle(10, 20);
		
		Vehicle v=new Vehicle("Sad");
		//v.typeOfvehicle(20, 1);
	}
}
