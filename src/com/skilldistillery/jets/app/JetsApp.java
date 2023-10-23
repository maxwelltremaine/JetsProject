package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Bomber;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerTransport;
import com.skilldistillery.jets.entities.StealthFighter;

public class JetsApp {
	private Scanner sc = new Scanner(System.in);
	private AirField aF = new AirField();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JetsApp app = new JetsApp();
		app.launch();
	}

	private void launch() {
		List<Jet> fleet = aF.getFleet();
		while (true) {
			menu();

			int userInput = sc.nextInt();

			if (userInput == 1) {
				listFleet(fleet);
			}

			else if (userInput == 2) {
				flyAllJets(fleet);
			} 
			
			else if (userInput == 3) {
				viewFastestJet(fleet);
			}
			
			else if (userInput == 4) {
				viewLongestRangeJet(fleet);
			} 
			
			else if (userInput == 5) {
				bombsAway(fleet);
			} 
			
			else if (userInput == 6) {
				engageStealth(fleet);
				
			} 
			else if (userInput == 7) {
				addJet(fleet);
				
			} 
			else if (userInput == 8) {
				removeJet(fleet, sc);
				
			}
			else if (userInput == 9) {
				System.out.println("Thanks for flying and we'll meet again");
				System.out.println("Don't know where don't know when, but i know well meet again some sunny day");
				break;
			}

		}
	}

	private void menu() {
		System.out.println("--------------------------------------------------");
		System.out.println("Press 1 to list fleet");
		System.out.println("Press 2 to fly all jets ");
		System.out.println("Press 3 to view the fastest jet");
		System.out.println("Press 4 to view the jet with the longest range");
		System.out.println("Press 5 to drop bombs");
		System.out.println("Press 6 to engage Stealth Fighters");
		System.out.println("Press 7 to add a jet to the fleet");
		System.out.println("Press 8 to remove a jet from the fleet");
		System.out.println("Press 9 to quit");
		System.out.println("--------------------------------------------------");
	}

	public void listFleet(List<Jet> fleet) {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(fleet.get(i));
		}
	}

	public void flyAllJets(List<Jet> fleet) {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(fleet.get(i));
			fleet.get(i).fly();
			System.out.println();
		}
	}

	public void viewFastestJet(List<Jet> fleet) {
		double fastestSpeed = 0;
		Jet fastestJet = null;
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).getSpeed() > fastestSpeed) {
				fastestSpeed = fleet.get(i).getSpeed();
				fastestJet = fleet.get(i);
			}
		}
		System.out.println("The fastest jet is ");
		System.out.println(fastestJet.toString());
	}

	public void viewLongestRangeJet(List<Jet> fleet) {
		double longestRange = 0;
		Jet longestRangeJet = null;
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).getRange() > longestRange) {
				longestRange = fleet.get(i).getRange();
				longestRangeJet = fleet.get(i);
			}
		}
	}

	public void bombsAway(List<Jet> fleet) {
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof Bomber) {
				((Bomber) fleet.get(i)).dropBombs();
			}
		}
	}

	public void engageStealth(List<Jet> fleet) {
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof StealthFighter) {
				((StealthFighter) fleet.get(i)).engageStealth();
			}
		}
	}

	public void addJet(List<Jet> fleet) {
		fleet.add(new PassengerTransport("Passenger Transport", "zoom zoom", 500, 20000, 9000000));
	}

	public void removeJet(List<Jet> fleet, Scanner remover) {
		System.out.println("Please enter the number of the jet you would like to remove");
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(i + 1 + " " + fleet.get(i));
		}
		int r = remover.nextInt();
		if (r > fleet.size() || r < 0) {
			System.out.println("This is not a valid input");
		} else {
			fleet.remove(r - 1);
		}
	}
}
