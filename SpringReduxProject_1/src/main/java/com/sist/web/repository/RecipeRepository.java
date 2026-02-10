package com.sist.web.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sist.web.entity.RecipeEntity;

public interface RecipeRepository extends JpaRepository<RecipeEntity, Integer> {
	
	// findAll()
	

}
