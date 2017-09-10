package com.gojek.actions;

import com.gojek.parkinglot.ParkingLot;

public final class CreateParkLot {
	private static StringBuilder output;
	static ParkingLot parkingLot;
	public  static void createParkingLot(String[] params) {

		String param = params[1];
		int numSlots = Integer.parseInt(param);
		parkingLot = new ParkingLot(numSlots);
		printOut("Created a parking lot with " + numSlots +" slots");
	
}
	
	 static void printOut(String message) {
		 
			output = output != null ? output.append(message)
					.append(System.getProperty("line.separator")) 
					: new StringBuilder(message); 
			System.out.println(message);
		}
	public static  ParkingLot getParkingLot() {
		return parkingLot;
	}
	
	
}
