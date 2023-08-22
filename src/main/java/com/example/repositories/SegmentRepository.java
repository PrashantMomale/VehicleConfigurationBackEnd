package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Segment;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface SegmentRepository  extends JpaRepository<Segment,Integer>{
	

}
