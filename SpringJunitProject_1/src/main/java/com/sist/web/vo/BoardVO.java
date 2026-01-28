package com.sist.web.vo;

import lombok.Data;

@Data
public class BoardVO {

	private int no,hit;
	private String name,subject,content,pwd,dbday;
	private String regdate;
}
