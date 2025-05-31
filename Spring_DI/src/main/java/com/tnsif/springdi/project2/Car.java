package com.tnsif.springdi.project2;

public class Car {

	private Wheel wheelObj;//instance variable - holding the object which will be created by IoC container

	public Car(Wheel wheelObj) {
		this.wheelObj = wheelObj;
	}

	public Wheel getWheelObj() {
		
		
		return wheelObj;
	}

	public void setWheelObj(Wheel wheelObj) {
		this.wheelObj = wheelObj;
	}
	
	public void dispCarInfo()
	{
		System.out.println("Display Car's Wheel Size: "+wheelObj.getWheelSize());
	}
	
	
	
	
	
}
