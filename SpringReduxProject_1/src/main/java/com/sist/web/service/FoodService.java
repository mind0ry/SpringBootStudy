package com.sist.web.service;

import java.util.List;


import com.sist.web.entity.FoodEntity;
import com.sist.web.vo.FoodDTO;

public interface FoodService {
	
	public List<FoodDTO> foodListData(int start);
	public int foodTotalPage(); // count
	// 상세보기
	public FoodEntity findByFno(int fno);
}
