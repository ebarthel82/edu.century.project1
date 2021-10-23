package edu.century.project1;

public class Athlete {

	private String name;
	private Country homeCountry; //TODO change to Country object once created 
	private Sport specialty;  //TODO change to Sport object once created
	private int skill;
	private int medals ;
	
	public Athlete() {
		name = "None";
		homeCountry = Country.selectRandomCountry();
		specialty = Sport.selectRandomSport();
		skill = 0;
		medals  = 0;
	}
	
	public Athlete(String userName, Country userCountry, Sport userEvent, int level, int gold) {   
		name = userName;
		homeCountry = userCountry;
		specialty = userEvent;
		skill = level;
		medals  = gold;
	}
	
	public String getName() {
		return name;
	}
	
	public Country getHomeCountry()  { 
		return homeCountry;
	}
	
	public Sport getSpecialty() { 
		return specialty;
	}
	
	public int getSkill() {
		return skill;
	}
	
	public int getMedal() {
		return medals ;
	}
	
	public void  setName(String input) {
		if (input.length() < 1) {
			name = "DEFAULT";
		}
		else {
		name = input;
		}
	}
	
	public void  setSpecialty(Sport input) {
		specialty = input;
	}
	
	public void  setSkill(int input) {
		if (input < 0 || input > 10) {
			skill = 0;
		}
		else {
		skill = input;
		}
	}
	
	public void setMedals(int input) {
		if (input < 0) {
			medals = 0;
		}
		else {
		medals = input;
		}
	} 
	
	@Override
	public String toString() {
		return "Name: " + name + "/nCountry: " + homeCountry + "/nSpecialty: " + specialty + "/nSkill Level: " + skill + "/nGold Medals: " + medals; //TODO  Finish toString Method
	}
	 
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
		
		// TODO finish .equals method
	}


	}

	

