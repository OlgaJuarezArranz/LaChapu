package com.stratio.services;

import com.stratio.entities.CurrentHierarchy;

public interface CurrentHierarchyService {

	 /**
     * Method to doing the member A boss of member B in present moment
     */
	public CurrentHierarchy ABecomesABossOfB(CurrentHierarchy currentHierarchy);
}
