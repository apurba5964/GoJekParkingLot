package com.gojek.actions;

import com.gojek.parkinglot.Slot;
import com.gojek.vehicle.Car;
import com.gojek.vehicle.IVehicle;

public class Park extends Action{

	@Override
	public void action(String[] params) {
		
		String regNumber = params[1];
		String color = params[2];
		IVehicle vehicle = new Car(regNumber, color);
		Slot parkedSlot = CreateParkLot.getParkingLot().parkVehicle(vehicle);
		if(parkedSlot != null) {
			printOut("Allocated slot number: " +  parkedSlot.getSerialNumber());
		}
		else {
			printOut("Sorry, parking lot is full");
		}
		
		
	}

	
}
