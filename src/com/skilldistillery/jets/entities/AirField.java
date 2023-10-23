package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jet> fleet;

	public List<Jet> getFleet() {
		return fleet;
	}
	
		public AirField() {
		readJets();
	}

	private void readJets() {
//		String name, double speed, int range, long price
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			Jet jet = null;
			fleet = new ArrayList<>();
			while ((line = bufIn.readLine()) != null) {
			 String[] jetInfo = line.split(", ");
			 String name = jetInfo[0];
			 String model = jetInfo[1];
			 double speed = Double.parseDouble(jetInfo[2]);
			 int range  = Integer.parseInt(jetInfo[3]);
			 long price = Long.parseLong(jetInfo[4]);
			 
			 if (name.equalsIgnoreCase("Bomber")){
				  jet = new Bomber(name, model, speed,range, price);
			 }
			 else if (name.equalsIgnoreCase("Passenger Transport")){
				  jet = new PassengerTransport(name, model, speed,range, price);
			 }
			 else if (name.equalsIgnoreCase("Stealth Fighter")){
				  jet = new StealthFighter(name, model, speed,range, price);
				 
			 }
			 
			 fleet.add(jet);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
