package com.gojek.actions;

public class FindSlotsByVehicleRegNum extends Action{

	@Override
	public
	void action(String[] params) {
		

		String regNum = params[1];
		printOut(String.join(",", CreateParkLot.getParkingLot().findSlotsByVehicleRegNum(regNum)));
	
		
	}

}
