package com.skilldistillery.jets.entities;

public class StealthFighter extends Jet implements StealthFighterInterface{
	

	

	public StealthFighter(String name, String model, double speed, int range, long price) {
		super(name, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fly() {
		System.out.println("Distance flyable: " +(double) (this.range / this.speed));
	}
	// TODO Auto-generated method stub
		

	@Override
	public void engageStealth() {
		System.out.println("Pilot 1: Going ghost");
		System.out.println("Pilot 2: THAT'S A TERRIBLE CATCH PHRASE");
		System.out.println("Pilot 1: I'd like to see you do better! YOU THOUGHT STEALTH MODE ACTIVATE WAS COOL!");
		System.out.println("Command: GENTLEMEN THERE WILL BE NO FIGHTING IN THE FIGHTER JET");
		System.out.println();
		// TODO Auto-generated method stub
		
	}

	
}
