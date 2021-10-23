package edu.century.project1;

import java.util.Random;

public class Event {
	private String name;
	private Venue venue;
	private Sport sport;
	private Athlete[] athletes;
	
	public Event() {
		name = "DEFAULT";
		venue = Venue.selectRandomVenue();
		sport = Sport.selectRandomSport();
		athletes = new Athlete[2];
		athletes[1] = new Athlete();
		athletes[2] = new Athlete();
		
	}
	public Event(String userName, Venue userVenue, Sport userSport, Athlete[] userInput) {
		name = userName;
		venue = userVenue;
		sport = userSport;
		athletes = new Athlete[userInput.length];
		for (int i = 0; i < userInput.length; i++) {
			athletes[i] = userInput[i];
		}
	}
	public String getName()  {
		return name;
	}
	public void setName(String input) {
		name = input;
	}  
	public Venue getVenue()  {
		return venue;
	}
	public void setVenue(Venue input) {
		venue = input;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport input) {
		sport = input;
	}
	public Athlete[] getAthletes() {
		return athletes;
	}
	public void setAthlete(Athlete[] userInput) {
		if (userInput.length < 1) {
			System.out.println("ERROR EVENT MUST HAVE AT LEAST ONE PARTICIPANT");
		}
		for (int i = 0; i < userInput.length; i++) {
			athletes[i] = userInput[i];
		}
		
	}
	public String toString() {
		return "Event Name: " + name + "/nVenue: " + venue + "/nSport: " + sport + "/nAthletes: " + athletes;
	}
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
	
	public Athlete compete(Athlete[] userInput) {
		for (int i = 0; i < userInput.length; i++) {
			Random rand = new Random();
			int performance = rand.nextInt(50) + 1;
			int temp = athletes[i].getSkill();
			athletes[i].setSkill(temp + performance); 
		}
		
		Athlete winner = athletes[0];
		for (int i=0; i < userInput.length; i++) {
			if (athletes[i].getSkill() > winner.getSkill() ) {
				winner = athletes[i];
			}
		}
		return winner;
		
	}
	
}
