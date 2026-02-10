package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="seoultravel")
@Data
public class SeoulTravel {
	@Id
	private int no;
	private int contentid, contenttype, hit;
	private String title, image1, image2, address;
	private double x, y;
}
