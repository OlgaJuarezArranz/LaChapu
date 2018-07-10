package com.stratio.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletResponse;

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
	@ApiOperation(value = "addMember")
	public void addMafiaMember(@RequestParam("memberName") String memberName, @RequestParam("memberStatus") String memberStatus, @RequestParam("memberJoinDate") Date memberJoinDate, @RequestParam("memberBigBoss") Boolean memberBigBoss) {
	       
	        MafiaMembers mafiaMembers = new MafiaMembers(memberName, memberStatus, memberJoinDate, memberBigBoss);
	       mafiaMembersService.addMafiaMember(mafiaMembers);
	        
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/hola" }, method = RequestMethod.GET)
	@ApiOperation(value = "hola")
	public String digoHola(HttpServletResponse response){
		System.out.print("He pasado por aquí");
			

		StringBuilder htmlResponse = new StringBuilder();
		htmlResponse.append("<html> <head>");
		htmlResponse.append("<title> Mafia " + "hola" + " </title>");
		htmlResponse.append("</head> <body>");
		htmlResponse.append("<ul><h2> Se ha iniciado el proceso de migracion con los siguientes parametros: </h2>");
		htmlResponse.append("<li><h3> Status: PUBLISHED. </h3></li>");
		htmlResponse.append("<li><h3> ContentType: " + "adiós" + ". </h3></li>");
		htmlResponse.append("<li><h3> Action. </h3></li>");
		htmlResponse.append("</ul></body> </html>");

		return htmlResponse.toString();
	}
}
