package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Segment;
import com.example.repositories.SegmentRepository;

@Service
public class Segmentmanagerimpl implements Segmentmanager {
	@Autowired
	private SegmentRepository seg_repo;

	@Override
	public List<Segment> Getallseg() {
		return seg_repo.findAll();
	}

	@Override
	public Optional<Segment> byid(int id) {
		
		return seg_repo.findById(id);
	}

}
