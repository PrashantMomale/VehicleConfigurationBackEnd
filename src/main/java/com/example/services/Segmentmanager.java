package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Segment;

public interface Segmentmanager {
	
	List<Segment> Getallseg ();
	Optional<Segment> byid(int id);

}
