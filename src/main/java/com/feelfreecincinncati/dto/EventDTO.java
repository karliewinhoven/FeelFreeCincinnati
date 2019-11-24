package com.feelfreecincinncati.dto;



public class EventDTO {
	private int eventID;
	private String name; 
	private String Address;
	//**Insert date variable here and generate getter and setter and add into the toString method at bottom**
	private double cost;
	private String description;
	
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}

	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		
		return "Go to a " +name + "for " + description + ". it is at " +Address + " and will cost $" +cost;
	}
}
