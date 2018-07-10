package com.stratio.dto;

import java.io.Serializable;

public class CurrentHierarchyDTO implements Serializable{

	private static final long serialVersionUID = -1572299413578173135L;
	
	private Integer bossId;
	private Integer subordinateId;
	
	public CurrentHierarchyDTO(){
	}

	public CurrentHierarchyDTO(Integer bossId, Integer subordinateId) {
		super();
		this.bossId = bossId;
		this.subordinateId = subordinateId;
	}

	public Integer getBossId() {
		return bossId;
	}

	public void setBossId(Integer bossId) {
		this.bossId = bossId;
	}

	public Integer getSubordinateId() {
		return subordinateId;
	}

	public void setSubordinateId(Integer subordinateId) {
		this.subordinateId = subordinateId;
	}
	
}
