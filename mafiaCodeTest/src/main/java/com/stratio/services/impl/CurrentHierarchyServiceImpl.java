package com.stratio.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stratio.entities.CurrentHierarchy;
import com.stratio.repositories.CurrentHierarchyRepo;
import com.stratio.services.CurrentHierarchyService;

@Service("currentHierarchyService")
public class CurrentHierarchyServiceImpl implements CurrentHierarchyService {
	
	public CurrentHierarchyServiceImpl(){
	}

	@Autowired
	private CurrentHierarchyRepo currentHierarchyRepo;

	  /**
     * Method to doing the member A boss of member B in present moment
     * @param currentHierarchy
     * @return CurrentHierarchy
     */
	@Override
	public CurrentHierarchy aBecomesABossOfB(CurrentHierarchy currentHierarchy) {
		return currentHierarchyRepo.save(currentHierarchy);
	}
	
	/**
	 * Method to doing the member A stop being the boss of member B
	 * @param currentHierarchy
     * @return CurrentHierarchy
     * @return Integer
	 */
	@Override
	public void aIsNotABossOfB(Integer mafiaMemberAId, Integer mafiaMemberBId) {
		Integer currentHierarchyId = currentHierarchyRepo.findByBossIdAndSubordinateId(mafiaMemberAId, mafiaMemberBId);
		 currentHierarchyRepo.delete(currentHierarchyId);
	}
}
