package com.gojek.actions;

import java.util.List;

import com.gojek.parkinglot.Slot;

public class Status extends Action{

	@Override
	public
	void action(String[] params) {
		
		if(CreateParkLot.getParkingLot() == null) {
			printOut("No Parking lot created");
			return;
		}
		List<Slot> slots = CreateParkLot.getParkingLot().getSlots();
		for(int i=0; i< slots.size(); i++) {
			if(!slots.get(i).isFree()) {
			printOut(slots.get(i).getSerialNumber() + "\t"
					+ slots.get(i).getParkedVehicle().getRegistrationNumber() + "\t"
					+ slots.get(i).getParkedVehicle().getColor());
			}
		}
		
	}

	
}
