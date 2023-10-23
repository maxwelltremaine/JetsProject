package com.skilldistillery.jets.entities;

public class PassengerTransport extends Jet {
	
	

	public PassengerTransport(String name, String model, double speed, int range, long price) {
		super(name, model, speed, range, price);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void fly() {
		System.out.println("Distance flyable: " + (double) (this.range / this.speed));

	}

}
