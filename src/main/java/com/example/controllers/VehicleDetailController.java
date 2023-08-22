package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.Price;
import com.example.services.VehicleDetailManager;


@RestController
public class VehicleDetailController {
	@Autowired
	private VehicleDetailManager vehicledetail_mgr;
	
	@GetMapping("api/componentbyc/{model_id}")
	public String getVehicleDetailsByCore(@PathVariable int model_id){
		return vehicledetail_mgr.getVehicleDetailsByCore(model_id);
	}
	
	@GetMapping("api/componentbys/{model_id}")
	public String getVehicleDetailsByStandard(@PathVariable int model_id){
		return vehicledetail_mgr.getVehicleDetailsByCore(model_id);
	}
	
	
	
	@GetMapping("api/price/{model_id}")
	public double getPrice(@PathVariable int model_id){
		return vehicledetail_mgr.getPrice(model_id);
	}
	
	@GetMapping("api/componentbyi/{model_id}")
	public String getVehicleDetailsByInterior(@PathVariable int model_id){
		return vehicledetail_mgr.getVehicleDetailsByInterior(model_id);
	}
	
	@GetMapping("api/componentbye/{model_id}")
	public String getVehicleDetailsByExterior(@PathVariable int model_id){                                            
		return vehicledetail_mgr.getVehicleDetailsByExterior(model_id);
	}
	
}
