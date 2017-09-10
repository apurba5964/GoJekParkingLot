package com.gojek.actions;

import com.gojek.parkinglot.ParkingLot;

public abstract class Action {
public	abstract void action(String[] params);
	
	private StringBuilder output;

	
	 void printOut(String message) {
		 
		output = this.output != null ? output.append(message)
				.append(System.getProperty("line.separator")) 
				: new StringBuilder(message); 
		System.out.println(message);
	}
	 
	 

	

}
