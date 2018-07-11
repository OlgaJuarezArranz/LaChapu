package com.stratio.services.impl;

import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.After;
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

@RunWith(MockitoJUnitRunner.class)
public class MafiaMembersServiceImplTest {

	private static final Integer MEMBER_ID = new Integer(73);
	private static final String MEMBER_NAME = "Sub64";
	private static final String MEMBER_STATUS = "Free";
	private static final Date MEMBER_JOIN_DATE = new Date();
	private static final Boolean MEMBER_BIG_BOSS = Boolean.FALSE;

	private MafiaMembers mafiaMembersMock = new MafiaMembers();

	@InjectMocks
	private MafiaMembersServiceImpl mafiaMembersServiceImplMock;

	@Mock
	private MafiaMembersRepo mafiaMembersRepoMock;

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mafiaMembersMock.setMemberId(MEMBER_ID);
		mafiaMembersMock.setMemberName(MEMBER_NAME);
		mafiaMembersMock.setMemberJoinDate(MEMBER_JOIN_DATE);
		mafiaMembersMock.setMemberStatus(MEMBER_STATUS);
		mafiaMembersMock.setMemberBigBoss(MEMBER_BIG_BOSS);
	}

	@After
	public void tearDown() {
	}

	@Test
	public void shouldAddMafiaMember() {
		when(mafiaMembersServiceImplMock.addMafiaMember(mafiaMembersMock)).thenReturn(mafiaMembersMock);
		assertNotNull(mafiaMembersServiceImplMock.addMafiaMember(mafiaMembersMock));
		assertThat(mafiaMembersServiceImplMock.addMafiaMember(mafiaMembersMock), instanceOf(MafiaMembers.class));
	}
	
//	@Test
//	public void shouldPutAMemberInJail() {
//		when(mafiaMembersServiceImplMock.putAMemberInJail(mafiaMembersMock)).thenReturn(mafiaMembersMock);
//		assertNotNull(mafiaMembersServiceImplMock.putAMemberInJail(mafiaMembersMock));
//		assertThat(mafiaMembersServiceImplMock.putAMemberInJail(mafiaMembersMock), instanceOf(MafiaMembers.class));
//	}
	
//	@Test
//	public void shouldGetOutAMemberInJail() {
//		when(mafiaMembersServiceImplMock.getOutAMemberInJail(mafiaMembersMock)).thenReturn(mafiaMembersMock);
//		assertNotNull(mafiaMembersServiceImplMock.getOutAMemberInJail(mafiaMembersMock));
//		assertThat(mafiaMembersServiceImplMock.getOutAMemberInJail(mafiaMembersMock), instanceOf(MafiaMembers.class));
//	}
	
//	@Test
//	public void shouldBecomeAMemberTheBigBoss() {
//		when(mafiaMembersServiceImplMock.becomeAMemberTheBigBoss(mafiaMembersMock)).thenReturn(mafiaMembersMock);
//		assertNotNull(mafiaMembersServiceImplMock.becomeAMemberTheBigBoss(mafiaMembersMock));
//		assertThat(mafiaMembersServiceImplMock.becomeAMemberTheBigBoss(mafiaMembersMock), instanceOf(MafiaMembers.class));
//	}
}
