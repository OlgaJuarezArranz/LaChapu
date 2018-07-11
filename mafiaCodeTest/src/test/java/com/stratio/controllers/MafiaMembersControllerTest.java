package com.stratio.controllers;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.stratio.entities.MafiaMembers;
import com.stratio.repositories.MafiaMembersRepo;
import com.stratio.services.MafiaMembersService;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MafiaMembersControllerTest {

	private static final String MEMBER_NAME = "Sub64";
	private static final String MEMBER_STATUS = "Free";
	private static final Date MEMBER_JOIN_DATE = new Date();
	private static final Boolean MEMBER_BIG_BOSS = Boolean.FALSE;

	@InjectMocks
	private MafiaMembersController mafiaMembersControllerMock;

	@Mock
	private MafiaMembersService mafiaMembersServiceMock;

	@Mock
	private MafiaMembers mafiaMembersMock;

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldAddMafiaMember() {
		when(mafiaMembersControllerMock.addMafiaMember(MEMBER_NAME, MEMBER_STATUS, MEMBER_JOIN_DATE, MEMBER_BIG_BOSS))
				.thenReturn(mafiaMembersMock);
	}

}
