package com.sist.web.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sist.web.entity.RecipeDetailEntity;
import com.sist.web.entity.RecipeEntity;
import com.sist.web.vo.RecipeListVO;

public interface RecipeService {

	public Page<RecipeEntity> findAll(Pageable pg);
	public int recipeTotalPage();
	public RecipeDetailEntity findByNo(int no);
}
