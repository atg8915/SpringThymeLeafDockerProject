package com.sist.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sist.web.entity.Chef;

import java.util.*;
public interface ChefRepository extends JpaRepository<Chef, String> {
	// findAll
	// count
	// JOIN Recipe = Chef => @Query
	
}
