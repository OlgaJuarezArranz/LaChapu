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
	public void addMafiaMember(MafiaMembers mafiaMembers) {
			mafiaMembersRepo.save(mafiaMembers);
	}
}
