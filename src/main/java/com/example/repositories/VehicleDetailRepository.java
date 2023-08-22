package com.example.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dtos.Price;
import com.example.entities.Vehicle_detail;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface VehicleDetailRepository  extends JpaRepository<Vehicle_detail, Integer> {
	@Query(value  = "select comp_name from Component c join Vehicle_detail v on c.comp_Id = v.comp_id where comp_type = 's' and v.model_id = :model_id",nativeQuery = true)
	String getVehicleDetailsByCore(@Param("model_id") int model_id);
	
	@Query(value  = "select comp_name from Component c join Vehicle_detail v on c.comp_Id = v.comp_id where comp_type = 'c' and v.model_id = :model_id",nativeQuery = true)
	String getVehicleDetailsByStandard(@Param("model_id") int model_id);
	
	@Query(value  = "select comp_name from Component c join Vehicle_detail v on c.comp_Id = v.comp_id where comp_type = 'i' and v.model_id = :model_id",nativeQuery = true)
	String getVehicleDetailsByInterior(@Param("model_id") int model_id);
	
	@Query(value  = "select comp_name from Component c join Vehicle_detail v on c.comp_Id = v.comp_id where comp_type = 'e' and v.model_id = :model_id",nativeQuery = true)
	String getVehicleDetailsByexterior(@Param("model_id") int model_id);
	
	
	@Query(value = "select new com.example.dtos.Price(v.price) from Variant v where v.model_id = :model_id" )
	Price getPriceByModel(@Param("model_id") int model_id);
	

}