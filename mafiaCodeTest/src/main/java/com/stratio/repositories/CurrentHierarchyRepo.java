package com.stratio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.stratio.entities.CurrentHierarchy;

public interface CurrentHierarchyRepo extends JpaRepository<CurrentHierarchy, Integer> {
	
	@Query("SELECT c.currentHierarchyId FROM CurrentHierarchy c WHERE c.bossId = :bossId AND c.subordinateId = :subordinateId ")
	public Integer findByBossIdAndSubordinateId(@Param(value = "bossId") Integer bossId, @Param(value = "subordinateId") Integer subordinateId);

}
