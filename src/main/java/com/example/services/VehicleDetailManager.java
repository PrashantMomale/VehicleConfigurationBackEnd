package com.example.services;

public interface VehicleDetailManager {

	public String getVehicleDetailsByCore(int model_id);
	public String getVehicleDetailsByStandard(int model_id);
	public String getVehicleDetailsByInterior(int model_id);
	public String getVehicleDetailsByExterior(int model_id);
	public double getPrice(int model_id);
}
