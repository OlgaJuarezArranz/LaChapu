package com.stratio.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "imprisonedTimeHierarchy")
public class ImprisonedTimeHierarchy {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "imprisoned_id", unique = true, nullable = false)
	private Integer imprisonedId;
	
	@Column(name = "imprisoned_boss_id", nullable = false)
	private Integer imprisonedBossId;
	
	@Column(name = "imprisoned_subordinate_id", nullable = false)
	private Integer imprisonedSubordinateIdList;
	
	public ImprisonedTimeHierarchy(){
	}

	public ImprisonedTimeHierarchy(Integer imprisonedId, Integer imprisonedBossId,
			Integer imprisonedSubordinateIdList) {
		super();
		this.imprisonedId = imprisonedId;
		this.imprisonedBossId = imprisonedBossId;
		this.imprisonedSubordinateIdList = imprisonedSubordinateIdList;
	}

	public Integer getImprisonedId() {
		return imprisonedId;
	}

	public void setImprisonedId(Integer imprisonedId) {
		this.imprisonedId = imprisonedId;
	}

	public Integer getImprisonedBossId() {
		return imprisonedBossId;
	}

	public void setImprisonedBossId(Integer imprisonedBossId) {
		this.imprisonedBossId = imprisonedBossId;
	}

	public Integer getImprisonedSubordinateIdList() {
		return imprisonedSubordinateIdList;
	}

	public void setImprisonedSubordinateIdList(Integer imprisonedSubordinateIdList) {
		this.imprisonedSubordinateIdList = imprisonedSubordinateIdList;
	}

}
