package edu.century.project1;

import java.util.Arrays;
import java.util.Random;


/**
 * 
 * Olympic Game Simulation Program
 * Creates Event and Athlete objects then uses those objects to simulate events at an olympic game
 * 
 * Created for CSCI 1082-70 Object Oriented Programming
 * Professor Lisa Minogue
 * 
 * @author Eric Barthel
 * @version 1.0
 * @see Event
 * @see Athlete
 * @since 10/24/2021
 * 
 */
public class Simulation {

	public static void main(String[] args) {
		
		
		
		System.out.println("Driver Test");
		System.out.println("--------------------------------------");
		System.out.println("Testing Athlete Creation");
		Athlete ath1 = new Athlete();
		Athlete ath2 = new Athlete("Test", Country.UnitedStates, Sport.Swimming, 5, 1);
		System.out.println("");
		System.out.println("Testing toString() Method and Athlete Creation Success");
		System.out.println("");
		System.out.println(ath1);
		System.out.println("");
		System.out.println(ath2);
		System.out.println("");
		System.out.println("Testing Athlete Mutators and Accessors  ");
		System.out.println("--------------------------------------");
		System.out.println("");
		System.out.println("Testing Set Name");
		ath1.setName("Dexter Morgan");
		System.out.println("Testing Value Expected Dexter Morgan");
		System.out.println(ath1.getName());
		System.out.println("");
		System.out.println("Testing Set Specialty");
		ath1.setSpecialty(Sport.Judo);
		System.out.println("Testing Value Expected Judo");
		System.out.println(ath1.getSpecialty());
		System.out.println("");
		System.out.println("Testing Set Skill");
		System.out.println("Testing -1");
		ath1.setSkill(-1);
		System.out.println("Expected Output 0");
		System.out.println(ath1.getSkill());
		System.out.println("Testing 11");
		ath1.setSkill(11);
		System.out.println("Expected Output 0");
		System.out.println(ath1.getSkill());
		System.out.println("Testing 5");
		ath1.setSkill(5);
		System.out.println("Expected Output 5");
		System.out.println(ath1.getSkill());
		System.out.println("Testing 10");
		System.out.println("Expected Output 10");
		ath1.setSkill(10);
		System.out.println(ath1.getSkill());
		System.out.println("");
		System.out.println("Testing Set Medals");
		System.out.println("Testing -1");
		ath1.setMedals(-1);
		System.out.println("Expected Output 0");
		System.out.println(ath1.getMedal());
		System.out.println("Testing 1");
		ath1.setMedals(1);
		System.out.println("Expected Output 1");
		System.out.println(ath1.getMedal());
		System.out.println("Testing 5");
		ath1.setMedals(5);
		System.out.println("Expected Output 5");
		System.out.println(ath1.getMedal());
		System.out.println("Testing 100");
		ath1.setMedals(100);
		System.out.println("Expected Output 100");
		System.out.println(ath1.getMedal());
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("Testing .equals() Method");
		System.out.println("Testing ath1 = ath2 Expected False");
		System.out.println(ath1.equals(ath2));
		System.out.println("Testing Null Expecting False");
		System.out.println(ath1.equals(null));
		System.out.println("Testing ath1 = ath2 Expecting True");
		System.out.println(ath1.equals(ath1));
		System.out.println("-------------------------------------------");
		System.out.println("Testing adjust SKill Method");
		System.out.println("Generating Random modifier");
		ath2.adjustSkill();
		System.out.println("Expected output:  1 + number between 1 and 50");
		System.out.println(ath2.getSkill());
		System.out.println("-------------------------------------------");
		System.out.println("Test of Athlete Class Successful");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("Testing Event Class");
		System.out.println("");
		System.out.println("Testing Event Creation ");
		Event defaultEvent = new Event();
		Athlete[] testArry = {ath1, ath2};
		Event fiftyMeterBackStroke = new Event("50 Meter Backstroke", Venue.AriakeArena, Sport.Swimming, testArry);
		System.out.println("");
		System.out.println("Testing toString() Method and Event Creation");
		System.out.println("");
		System.out.println(defaultEvent);
		System.out.println("");
		System.out.println(fiftyMeterBackStroke);
		System.out.println("");
		System.out.println("Testing Successful");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("Testing Athlete Mutators and Accessors");
		System.out.println("");
		System.out.println("Testing Set Name");
		defaultEvent.setName("Jumping");
		System.out.println("Expected Output Jumping");
		defaultEvent.getName();
		System.out.println("");
		System.out.println("Testing Set Venue");
		defaultEvent.setVenue(Venue.EquestrianPark);
		System.out.println("Expected Output EquestrianPark");
		System.out.println(defaultEvent.getVenue());
		System.out.println("");
		System.out.println("Testing Set Sport");
		defaultEvent.setSport(Sport.Taekwando);
		System.out.println("Expected Output Taekwando");
		System.out.println(defaultEvent.getSport());
		System.out.println("");
		System.out.println("Testing Set Athletes");
		Athlete[] testArry2 = new Athlete[0];
		System.out.println("Testing Null Array");
		defaultEvent.setAthlete(testArry2);
		System.out.println("");
		System.out.println("Testing array of 2");
		defaultEvent.setAthlete(testArry);
		System.out.println(Arrays.toString(defaultEvent.getAthletes()));
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("Testing .equals() for events");
		System.out.println("Testing defaultEvent vs null  Expected False");
		System.out.println(defaultEvent.equals(null));
		System.out.println("Testing defaultEvent vs 50 Meter Backstroke Expected False");
		System.out.println(defaultEvent.equals(fiftyMeterBackStroke));
		System.out.println("Testing defaultEvent vs defaultEventcopy Expeted True");
		Event defaultEventCopy = defaultEvent;
		System.out.println(defaultEvent.equals(defaultEventCopy));
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("Testing Compete Method Expected Random winner Name");
		Athlete winner = fiftyMeterBackStroke.compete();
		System.out.println(winner);
		System.out.println("");
		System.out.println("Testing Complete All Methods Tested");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("System Simulation");
		System.out.println("--------------------------------------------");
		System.out.println("Creating 5 events with 3 athletes each");
		System.out.println("--------------------------");
		Random rand = new Random();
		Athlete swimmer1 = new Athlete("Bruce Banner", Country.selectRandomCountry(), Sport.Swimming, rand.nextInt(10)+1, 0 );
		Athlete swimmer2 = new Athlete("Peter Parker", Country.selectRandomCountry(), Sport.Swimming, rand.nextInt(10)+1, 0 );
		Athlete swimmer3 = new Athlete("Tony Stark", Country.selectRandomCountry(), Sport.Swimming, rand.nextInt(10)+1, 0 );
		Athlete golfer1 = new Athlete("Jean Grey", Country.selectRandomCountry(), Sport.Golf, rand.nextInt(10)+1, 0 );
		Athlete golfer2 = new Athlete("Luke Cage", Country.selectRandomCountry(), Sport.Golf, rand.nextInt(10)+1, 0 );
		Athlete golfer3 = new Athlete("Betty Grant", Country.selectRandomCountry(), Sport.Golf, rand.nextInt(10)+1, 0 );
		Athlete hockey1 = new Athlete("Clint Barton", Country.selectRandomCountry(), Sport.Hockey, rand.nextInt(10)+1, 0 );
		Athlete hockey2 = new Athlete("Phil Coulson", Country.selectRandomCountry(), Sport.Hockey, rand.nextInt(10)+1, 0 );
		Athlete hockey3 = new Athlete("Matt Murdock", Country.selectRandomCountry(), Sport.Hockey, rand.nextInt(10)+1, 0 );
		Athlete diving1 = new Athlete("Jessica Jones", Country.selectRandomCountry(), Sport.Diving, rand.nextInt(10)+1, 0 );
		Athlete diving2 = new Athlete("Katherine Pryde", Country.selectRandomCountry(), Sport.Diving, rand.nextInt(10)+1, 0 );
		Athlete diving3 = new Athlete("Cindy Moon", Country.selectRandomCountry(), Sport.Diving, rand.nextInt(10)+1, 0 );
		Athlete weightlifter1 = new Athlete("Janet Pym", Country.selectRandomCountry(), Sport.WeightLifting, rand.nextInt(10)+1, 0 );
		Athlete weightlifter2 = new Athlete("Harry Osborn", Country.selectRandomCountry(), Sport.WeightLifting, rand.nextInt(10)+1, 0 );
		Athlete weightlifter3 = new Athlete("Wade Wilson", Country.selectRandomCountry(), Sport.WeightLifting, rand.nextInt(10)+1, 0 );
		Athlete[] swimming = {swimmer1, swimmer2, swimmer3};
		Athlete[] golf = {golfer1, golfer2, golfer3};
		Athlete[] hockey = {hockey1, hockey2, hockey3};
		Athlete[] diving = {diving1, diving2, diving3};
		Athlete[] weight = {weightlifter1, weightlifter2, weightlifter3};
		Event swim = new Event("Swimming", Venue.selectRandomVenue(), Sport.Swimming, swimming);
		Event golfEvent = new Event("Golf", Venue.selectRandomVenue(), Sport.Golf, golf);
		Event hockeyEvent = new Event("Hockey", Venue.selectRandomVenue(), Sport.Hockey, hockey);
		Event divingEvent = new Event("Diving", Venue.selectRandomVenue(), Sport.Diving, diving);
		Event weightlifting = new Event("Weight Lifting", Venue.selectRandomVenue(), Sport.WeightLifting, weight);
		Athlete swimwin, golfwin, hockwin, divwin, weighwin;
		System.out.println("Todays Events are: ");
		System.out.println(swim + "\n");
		System.out.println(golfEvent + "\n");
		System.out.println(hockeyEvent + "\n");
		System.out.println(divingEvent + "\n");
		System.out.println(weightlifting + "\n");
		System.out.println("");
		swimwin = swim.compete();
		golfwin = golfEvent.compete();
		hockwin = hockeyEvent.compete();
		divwin = divingEvent.compete();
		weighwin = weightlifting.compete();
		System.out.println("Todays Winners Are:");
		System.out.println(swim.getName() + ": " + swimwin.getName() );
		System.out.println(golfEvent.getName() + ": " + golfwin.getName() );
		System.out.println(hockeyEvent.getName() + ": " + hockwin.getName() );
		System.out.println(divingEvent.getName() + ": " + divwin.getName() );
		System.out.println(weightlifting.getName() + ": " + weighwin.getName() );
		
		 
	
		
		
		
		
		
		System.out.println("");
		
		
	}

}
