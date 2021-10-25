package edu.century.project1;

import java.util.*;
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
 * @see Simulation
 * @since 10/24/2021
 * 
 */
public class Event {
	

	private String name;
	private Venue venue;
	private Sport sport;
	private Athlete[] athletes;
	
	/**
	 * Default Constructor 
	 */
	public Event() {
		name = "DEFAULT";
		venue = Venue.selectRandomVenue();
		sport = Sport.selectRandomSport();
		athletes = new Athlete[2];
		athletes[0] = new Athlete();
		athletes[1] = new Athlete();
		
	}
	
	/**
	 * Full Constructor
	 * @param userName Takes event Name from user
	 * @param userVenue Takes venue from user
	 * @param userSport Takes Sport from user
	 * @param userInput Takes Athlete Array from user
	 */
	public Event(String userName, Venue userVenue, Sport userSport, Athlete[] userInput) {
		name = userName;
		venue = userVenue;
		sport = userSport;
		athletes = new Athlete[userInput.length];
		for (int i = 0; i < userInput.length; i++) {
			athletes[i] = userInput[i];
		}
	}
	
	/**
	 * Returns Name Variable
	 * @return
	 */
	public String getName()  {
		return name;
	}
	
	/**
	 * Sets Name from user Input
	 * @param input
	 */
	public void setName(String input) {
		name = input;
	}  
	
	/**
	 * returns Venue Variable
	 * @return
	 */
	public Venue getVenue()  {
		return venue;
	}
	/**
	 * Sets Venue from user input
	 * @param input
	 */
	public void setVenue(Venue input) {
		venue = input;
	}
	
	/**
	 * Returns Sport Variable
	 * @return
	 */
	public Sport getSport() {
		return sport;
	}
	
	/**
	 * sets Sports From input
	 * @param input
	 */
	public void setSport(Sport input) {
		sport = input;
	}
	
	/**
	 * returns athletes array 
	 * @return
	 */
	public Athlete[] getAthletes() {
		return athletes;
	}
	
	/**
	 * Sets Athletes Array from input With Validation for empty Arrays
	 * @param userInput
	 */
	public void setAthlete(Athlete[] userInput) {
		if (userInput.length < 1) {
			System.out.println("ERROR EVENT MUST HAVE AT LEAST ONE PARTICIPANT");
		}
		for (int i = 0; i < userInput.length; i++) {
			athletes[i] = userInput[i];
		}
		
	}
	
	/**
	 * To String method returns string representation of array
	 * @return 
	 */
	public String toString() {
		return "Event Name: " + name + "\nVenue: " + venue + "\nSport: " + sport + "\nAthletes: " + Arrays.toString(athletes);
	}
	
	/**
	 * equals method returns booleen value of comparison of two Event Objects
	 * @return
	 */
	public boolean equals(Object otherObj) {
		if (otherObj == null) {
			return false;
			}
		else if (getClass() != otherObj.getClass()) {
			return false;
		}
		else {
			Event otherEvent = (Event)otherObj;
			return (this.name.equals(otherEvent.getName())) && (this.venue.equals(otherEvent.getVenue())) && 
					(this.sport.equals(otherEvent.getSport())) && (this.athletes.equals(otherEvent.getAthletes())) ; 
		}
	}
	
	/**
	 * Returns winner of a competition based on random modifiers 
	 * @return
	 */
	public Athlete compete() {
		for (int i = 0; i < athletes.length; i++) {
			athletes[i].adjustSkill();
		}
		
		Athlete winner = athletes[0];
		for (int i=0; i < athletes.length; i++) {
			if (athletes[i].getSkill() > winner.getSkill() ) {
				winner = athletes[i];
			}
		}
		return winner;
		
	}
	
}
