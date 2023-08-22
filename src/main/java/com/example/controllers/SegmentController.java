package com.example.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Segment;

import com.example.services.Segmentmanager;

@RestController
public class SegmentController {
	@Autowired
	private Segmentmanager seg_mgr;

	@GetMapping("api/segments")
	public List<Segment> getseg() {
		return seg_mgr.Getallseg();
	}
	/*
	@GetMapping("api/{id}")
	Optional<Segment> getbyid1(int id)
	{
		return seg_mgr.byid(id);
	}*/

}
