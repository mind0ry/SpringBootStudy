package com.sist.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.*;

import com.sist.web.entity.Emp;
import com.sist.web.vo.EmpDeptVO;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
	
	// JPQL => 테이블이 아니고 => 객체단위
	@Query("""
			SELECT e
			FROM Emp e
			JOIN e.dept d
			WHERE d.deptno=e.dept.deptno
			""")
	public List<Emp> findByDeptDeptno();
	
	@Query("""
			SELECT new com.sist.web.vo.EmpDeptVO(
				e.empno,
				e.sal,
				e.job,
				d.dname,
				d.loc	
			)
			FROM Emp e
			JOIN e.dept d
			WHERE d.deptno=e.dept.deptno
			""")
	public List<EmpDeptVO> findEmpDeptVO();
}
