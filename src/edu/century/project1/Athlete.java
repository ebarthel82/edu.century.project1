package edu.century.project1;

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
 * @see Simulation 
 * @see Athlete
 * @since 10/24/2021
 * 
 */
public class Athlete {

	private String name;
	private Country homeCountry; //TODO change to Country object once created 
	private Sport specialty;  //TODO change to Sport object once created
	private int skill;
	private int medals ;
	
	/**
	 * Default Constructor
	 */
	public Athlete() {
		name = "None";
		homeCountry = Country.selectRandomCountry();
		specialty = Sport.selectRandomSport();
		skill = 0;
		medals  = 0;
	}
	/**
	 * Full constructor taking input from user
	 * @param userName
	 * @param userCountry
	 * @param userEvent
	 * @param level
	 * @param gold
	 */
	public Athlete(String userName, Country userCountry, Sport userEvent, int level, int gold) {   
		name = userName;
		homeCountry = userCountry;
		specialty = userEvent;
		skill = level;
		medals  = gold;
	}
	
	/**
	 * returns name variable
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * returns homeCountry Variable
	 * @return
	 */
	public Country getHomeCountry()  { 
		return homeCountry;
	}
	
	/**
	 * returns Specialty Variable
	 * @return
	 */
	public Sport getSpecialty() { 
		return specialty;
	}
	
	/**
	 * returns skill variable
	 * @return
	 */
	public int getSkill() {
		return skill;
	}
	
	/**
	 * returns medals variable
	 * @return
	 */
	public int getMedal() {
		return medals ;
	}
	
	/**
	 * sets name variable from user input with input validation for length of at least 1 character
	 * @param input
	 */
	public void  setName(String input) {
		if (input.length() < 1) {
			name = "DEFAULT";
		}
		else {
		name = input;
		}
	}
	
	/**
	 * sets specialty variable from user input
	 * @param input
	 */
	public void  setSpecialty(Sport input) {
		specialty = input;
	}
	
	/**
	 * sets skill variable from user input with input validation for starting skill between 0 and 10
	 * @param input
	 */
	public void  setSkill(int input) {
		if (input < 0 || input > 10) {
			skill = 0;
		}
		else {
		skill = input;
		}
	}
	/**
	 * sets medals variable from user input with input validation for input 0 or greater
	 * @param input
	 */
	public void setMedals(int input) {
		if (input < 0) {
			medals = 0;
		}
		else {
		medals = input;
		}
	} 
	
	/**
	 *returns a string representation of Athlete Object
	 *@return  
	 */
	@Override
	public String toString() {
		return "Name: " + name + "\nCountry: " + homeCountry + "\nSpecialty: " + specialty + "\nSkill Level: " + skill + "\nGold Medals: " + medals + "\n"; //TODO  Finish toString Method
	}
	 /**
	  * returns boolean value of Athlete object comparison
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
			Athlete otherAthelete = (Athlete)otherObj;
			return (this.name.equals(otherAthelete.getName())) && (this.homeCountry.equals(otherAthelete.getHomeCountry())) && 
					(this.specialty.equals(otherAthelete.getSpecialty())) && (this.skill == otherAthelete.getSkill()) &&(this.medals == otherAthelete.getMedal()); 
		}
		
		
	}
	
	/**
	 * Skill adjustment method to add random number between 1 and 50 to starting skill 
	 */
	public void adjustSkill() {
		
			Random rand = new Random();
			int performance = rand.nextInt(50) + 1;
			int temp = skill;
			skill = temp + performance; 
		}
		
	}

	

	

