package com.stratio.dto;

import java.io.Serializable;

public class ImprisonedTimeHierarchyDTO implements Serializable {
	
	private Integer imprisonedBossId;
	private Integer imprisonedSubordinateId;
	
	public ImprisonedTimeHierarchyDTO(){
	}

	public ImprisonedTimeHierarchyDTO(Integer imprisonedBossId, Integer imprisonedSubordinateId) {
		super();
		this.imprisonedBossId = imprisonedBossId;
		this.imprisonedSubordinateId = imprisonedSubordinateId;
	}

	public Integer getImprisonedBossId() {
		return imprisonedBossId;
	}

	public void setImprisonedBossId(Integer imprisonedBossId) {
		this.imprisonedBossId = imprisonedBossId;
	}

	public Integer getImprisonedSubordinateId() {
		return imprisonedSubordinateId;
	}

	public void setImprisonedSubordinateId(Integer imprisonedSubordinateId) {
		this.imprisonedSubordinateId = imprisonedSubordinateId;
	}
	
}
