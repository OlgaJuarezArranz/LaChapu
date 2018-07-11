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
     * @param mafiaMemberAId
     * @param mafiaMemberBId
     * @return Integer
     */
	@Override
	public CurrentHierarchy ABecomesABossOfB(CurrentHierarchy currentHierarchy) {
		return currentHierarchyRepo.save(currentHierarchy);
	}
}
