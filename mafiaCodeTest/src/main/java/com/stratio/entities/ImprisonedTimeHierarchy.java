package com.stratio.entities;

import static javax.persistence.GenerationType.IDENTITY;

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
	
	@OneToMany(mappedBy = "imprisoned_boss_member_id")
	@Column(name = "imprisoned_boss_id")
	private Integer imprisonedBossId;
	
	@OneToMany(mappedBy = "imprisoned_subordinate_member_id")
	@Column(name = "imprisoned_subordinate_id")
	private Integer imprisonedSubordinateId;
	
	public ImprisonedTimeHierarchy(){
	}

	public ImprisonedTimeHierarchy(Integer imprisonedId, Integer imprisonedBossId, Integer imprisonedSubordinateId) {
		super();
		this.imprisonedId = imprisonedId;
		this.imprisonedBossId = imprisonedBossId;
		this.imprisonedSubordinateId = imprisonedSubordinateId;
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

	public Integer getImprisonedSubordinateId() {
		return imprisonedSubordinateId;
	}

	public void setImprisonedSubordinateId(Integer imprisonedSubordinateId) {
		this.imprisonedSubordinateId = imprisonedSubordinateId;
	}
	
}
