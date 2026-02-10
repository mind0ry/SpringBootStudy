package com.sist.web.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.sist.web.dto.FoodDTO;
import com.sist.web.entity.FoodEntity;

public interface FoodService {

	public List<FoodDTO> foodListData(@Param("start") int start);
	public int foodTotalPage();
	// JPA 규칙에 맞게
	public FoodEntity findByFno(int fno);
}
