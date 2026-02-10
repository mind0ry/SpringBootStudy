package com.sist.web.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sist.web.entity.RecipeDetailEntity;
import com.sist.web.entity.RecipeEntity;
import com.sist.web.vo.RecipeListVO;

import java.util.*;

public interface RecipeRepository extends JpaRepository<RecipeEntity, Integer> {
	
	
	// select * from recipedetail where no=10(매개변수)
	
	// count / delete / save(insert) / save(update)
}
