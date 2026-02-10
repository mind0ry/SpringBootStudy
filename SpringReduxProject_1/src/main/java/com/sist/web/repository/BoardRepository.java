package com.sist.web.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sist.web.entity.*;
import com.sist.web.vo.*;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
	@Query(value="SELECT no, subject, name, hit, TO_CHAR(regdate, 'YYYY-MM-DD') as dbday "
			+ "FROM board_1 "
			+ "ORDER BY no DESC "
			+ "OFFSET :start ROWS FETCH NEXT 10 ROWS ONLY", nativeQuery = true)
	public List<BoardDTO> boardListData(@Param("start") int start);
	
	public BoardEntity findByNo(int no);
}
