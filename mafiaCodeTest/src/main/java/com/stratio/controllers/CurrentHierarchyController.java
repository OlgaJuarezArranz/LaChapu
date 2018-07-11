package com.stratio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.stratio.entities.CurrentHierarchy;
import com.stratio.services.CurrentHierarchyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/currentHierarchy")
@Api(value = "infos")
public class CurrentHierarchyController {

	public CurrentHierarchyController() {
	}

	@Autowired
	private CurrentHierarchyService currentHierarchyService;

	/**
	 * Rest Service to make the member A boss of member B in present moment
	 * 
	 * @param mafiaMemberAId
	 * @param mafiaMemberBId
	 * @return Integer
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/memberABecomesABossOfMemberB" }, method = RequestMethod.GET)
	@ApiOperation(value = "method to member A becomes the boss of member B")
	public CurrentHierarchy aBecomesABossOfB(@RequestParam("mafiaMemberAId") Integer mafiaMemberAId,
			@RequestParam("mafiaMemberBId") Integer mafiaMemberBId) {
		CurrentHierarchy currentHierarchy = new CurrentHierarchy(mafiaMemberAId, mafiaMemberBId);
		return currentHierarchyService.aBecomesABossOfB(currentHierarchy);

	}

	/**
	 * Method to doing the member A stop being the boss of member B
	 * 
	 * @param mafiaMemberAId
	 * @param mafiaMemberBId
	 * @return Integer
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/memberAStopBeingABossOfMemberB" }, method = RequestMethod.GET)
	@ApiOperation(value = "method to member A stops being the boss of member B")
	public void aIsNotABossOfB(@RequestParam("mafiaMemberAId") Integer mafiaMemberAId,
			@RequestParam("mafiaMemberBId") Integer mafiaMemberBId) {
		currentHierarchyService.aIsNotABossOfB(mafiaMemberAId, mafiaMemberBId);
	}
}
