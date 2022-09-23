package com.defailtmethod1;

public class TestMain {

	public static void main(String[] args) {
		
		Vechiles vech=new Car();
		vech.Horn();
		//vech.speedMeter();
		Vechiles.speedMeter();
		
		Vechiles vech1=new Bike();
		vech1.Horn();
		//vech1.speedMeter();
		Vechiles.speedMeter();
	}
}
