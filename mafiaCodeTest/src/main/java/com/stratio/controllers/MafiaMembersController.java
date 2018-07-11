package com.stratio.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.stratio.entities.MafiaMembers;
import com.stratio.services.MafiaMembersService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@Api(value = "infos")
public class MafiaMembersController {
	
	public MafiaMembersController(){
	}
	
	@Autowired
	private MafiaMembersService mafiaMembersService;
	
    /**
     * Rest Service to add a new member of the mafia
     * @param memberName
     * @param memberStatus
     * @param memberJoinDate
     * @param memberBigBoss
     */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/addMember" }, method = RequestMethod.GET)
	@ApiOperation(value = "method to adding a new member of the mafia")
	public MafiaMembers addMafiaMember(@RequestParam("memberName") String memberName, @RequestParam("memberStatus") String memberStatus, @RequestParam("memberJoinDate") Date memberJoinDate, @RequestParam("memberBigBoss") Boolean memberBigBoss) {
	       
	        MafiaMembers mafiaMembers = new MafiaMembers(memberName, memberStatus, memberJoinDate, memberBigBoss);
	      return  mafiaMembersService.addMafiaMember(mafiaMembers);
	        
	}

}
