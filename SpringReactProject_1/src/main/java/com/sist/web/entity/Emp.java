package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.*;

@Entity
@Table(name="emp")
@Data
public class Emp {
	@Id
	private int empno;
	private String ename;
	private String job;
	private Date hiredate;
	private int sal;
	private Integer comm;
	private Integer mgr;
	
	@ManyToOne(fetch = FetchType.LAZY) // 지연
	@JoinColumn(name="deptno")
	private Dept dept;
}
