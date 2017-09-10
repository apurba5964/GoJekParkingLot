package com.gojek.actions;

public class Leave extends Action{

	@Override
	public
	void action(String[] params) {
		
			String param = params[1];
			int slotNum = Integer.parseInt(param);
			CreateParkLot.getParkingLot().leaveVehicle(slotNum);
			printOut("Slot number " + slotNum + " is free");
		
		
	}

}
