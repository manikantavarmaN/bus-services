package com.bus.busservices.utils;

public enum BusModelType {

	LINE("line"),
	STOP_POINT("StopPoint"),
	JOURNEY_PATTERN_POINT_ONLINE("JourneyPatternPointOnline");

	private final String model;

	BusModelType(String model) {
		this.model = model;
	}

	public String getModel(){
		return model;
	}

	public static BusModelType findByAbbr(String busType){
		for(BusModelType busModelType : values()){
			if( busModelType.getModel().equals(busType)){
				return busModelType;
			}
		}
		return null;
	}
}