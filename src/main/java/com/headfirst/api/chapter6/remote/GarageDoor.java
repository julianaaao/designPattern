package com.headfirst.api.chapter6.remote;

public class GarageDoor {
	String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	void up(){
		System.out.println(location + "GarageDoor UP");
	}

	void down(){
		System.out.println(location + "GarageDoor DOWN");
	}

	void stop(){
		System.out.println(location + "GarageDoor STOPPED");
	}

	void lightOn(){
		System.out.println(location + "Garage LIGHT ON");
	}
	void lightOff(){
		System.out.println(location + "Garage LIGHT OFF");
	}


}