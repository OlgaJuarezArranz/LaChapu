package com.stratio.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stratio.entities.MafiaMembers;
import com.stratio.repositories.MafiaMembersRepo;
import com.stratio.services.MafiaMembersService;

@Service("mafiaMembersService")
public class MafiaMembersServiceImpl implements MafiaMembersService {

	public MafiaMembersServiceImpl() {
	}

	@Autowired
	private MafiaMembersRepo mafiaMembersRepo;

	@Override
	public MafiaMembers addMafiaMember(MafiaMembers mafiaMembers) {
		return	mafiaMembersRepo.save(mafiaMembers);
		
	}
}
