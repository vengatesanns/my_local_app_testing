package com.helloworld.helloworld;

public class UserDetails {
	
	private String name;
	private String location;
	private String designation;
	
	public UserDetails(String username,String location,String designation)
	{
	    this.name = username;
	    this.location = location;
	    this.designation = designation;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
