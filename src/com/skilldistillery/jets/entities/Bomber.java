package com.skilldistillery.jets.entities;

public class Bomber extends Jet implements BomberInterface {
	
	
		// TODO Auto-generated constructor stub

	public Bomber(String name, String model, double speed, int range, long price) {
		super(name, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Distance before running out of fuel: " + name + " " + (double) (this.range / this.speed));
	}


	@Override
	public void dropBombs() {
		System.out.println("Pilot 1: Bombs away");
		System.out.println("Major Kong: YAAAAAAAAAWHOOOooooooooo");
		System.out.println("pilot 2: wait wheres Major kong?");
		System.out.println("KABOOOOOOOM");
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}
