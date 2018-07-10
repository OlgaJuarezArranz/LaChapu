package com.stratio.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currentHierarchy")
public class CurrentHierarchy implements Serializable {

	private static final long serialVersionUID = -481895029292195410L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "current_hierarchy_id", unique = true, nullable = false)
	private Integer currentHierarchyId;

	@Column(name = "boss_id", nullable = false)
	private Integer bossId;

	@Column(name = "subordinate_id", nullable = false)
	private Integer subordinateId;

	public CurrentHierarchy() {
	}

	public CurrentHierarchy(Integer currentHierarchyId, Integer bossId, Integer subordinateId) {
		super();
		this.currentHierarchyId = currentHierarchyId;
		this.bossId = bossId;
		this.subordinateId = subordinateId;
	}

	public Integer getCurrentHierarchyId() {
		return currentHierarchyId;
	}

	public void setCurrentHierarchyId(Integer currentHierarchyId) {
		this.currentHierarchyId = currentHierarchyId;
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
