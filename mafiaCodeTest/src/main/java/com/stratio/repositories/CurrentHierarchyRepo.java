package com.stratio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stratio.entities.CurrentHierarchy;

public interface CurrentHierarchyRepo extends JpaRepository<CurrentHierarchy, Integer> {

}
