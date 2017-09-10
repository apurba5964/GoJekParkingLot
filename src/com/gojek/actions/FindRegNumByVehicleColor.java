package com.gojek.actions;

public class FindRegNumByVehicleColor extends Action{

	@Override
	public
	void action(String[] params) {
		
		Math.abs(0);
		
		String color = params[1];
		printOut(String.join(",", CreateParkLot.getParkingLot().findRegNumByVehicleColor(color)));
		
	}

	
}
