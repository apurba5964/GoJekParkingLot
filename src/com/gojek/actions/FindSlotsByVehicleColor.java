package com.gojek.actions;

public class FindSlotsByVehicleColor extends Action{

	@Override
	public
	void action(String[] params) {

		String regNum = params[1];
		printOut(String.join(",", CreateParkLot.getParkingLot().findSlotsByVehicleRegNum(regNum)));
	}

}
