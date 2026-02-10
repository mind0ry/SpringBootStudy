package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="festival")
@Data
public class Festival {
	
	@Id
	private int no;
	private String eventstartdate,eventenddate,agelimit,playtime,eventplace,eventhomepage,
			usetime,spendtime,msg;
	
	@ManyToOne
	@JoinColumn(name="contentid")
	private SeoulTravel seoulTravel;
}
