package com.feelfreecincinncati.dto;

public class AdventureDTO {
	private int advID;
	private String adventure;
	
	
	public int getAdvID() {
		return advID;
	}
	public void setAdvID(int advID) {
		this.advID = advID;
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
