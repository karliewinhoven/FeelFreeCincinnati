package com.feelfreecincinncati.dto;

public class AdventureDTO {
	private int adventureID;
	private String adventure;
	
	
	public int getAdventureID() {
		return adventureID;
	}
	public void setAdventureID(int adventureID) {
		this.adventureID = adventureID;
	}
	public String getAdventure() {
		return adventure;
	}
	public void setAdventure(String adventure) {
		this.adventure = adventure;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Go out and: " + adventure;
	}
}
