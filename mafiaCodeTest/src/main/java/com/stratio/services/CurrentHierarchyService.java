package com.stratio.services;

import com.stratio.entities.CurrentHierarchy;

public interface CurrentHierarchyService {

	 /**
     * Method to doing the member A boss of member B in present moment
     */
	public CurrentHierarchy aBecomesABossOfB(CurrentHierarchy currentHierarchy);
	
	/**
	 * Method to doing the member A stop being the boss of member B
	 */
	public void aIsNotABossOfB(Integer mafiaMemberAId, Integer mafiaMemberBId);
}
