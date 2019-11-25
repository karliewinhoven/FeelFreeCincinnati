package com.feelfreecincinncati.dto;

public class AdventureDTO {
	private int adventureID;
	private String adventureName;

	public int getAdventureID() {
		return adventureID;
	}


	public void setAdventureID(int adventureID) {
		this.adventureID = adventureID;
	}


	public String getAdventureName() {
		return adventureName;
	}


	public void setAdventureName(String adventureName) {
		this.adventureName = adventureName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Go out and: " + adventureName;
	}
}
