package com.stratio.entities;

import com.stratio.entities.MafiaMembers;
import javax.persistence.Table;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.CoreMatchers.instanceOf;


@RunWith(SpringRunner.class)
public class MafiaMembersTest {

	private static final Integer MEMBER_ID = new Integer(1);
	private static final String MEMBER_NAME = "MEMBER_NAME";
	private static final String MEMBER_STATUS = "MEMBER_STATUS";
	private static final Date MEMBER_JOIN_DATE = new Date(0);
	private static final Boolean MEMBER_BIG_BOSS = Boolean.FALSE;
	
	@InjectMocks
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
		mafiaMembersMock.setMemberId(MEMBER_ID);
		mafiaMembersMock.setMemberName(MEMBER_NAME);
		mafiaMembersMock.setMemberStatus(MEMBER_STATUS);
		mafiaMembersMock.setMemberJoinDate(MEMBER_JOIN_DATE);
		mafiaMembersMock.setMemberBigBoss(MEMBER_BIG_BOSS);
	}

	@After
	public void tearDown() {
	}

	@Test
	public void type() {
		assertThat(mafiaMembersMock, instanceOf(MafiaMembers.class));
	}

	@Test
	public void shouldGetMemberId() {
		assertNotNull(mafiaMembersMock.getMemberId());
	}

	@Test
	public void shouldGetMemberStatus() {
		assertNotNull(mafiaMembersMock.getMemberStatus());
	}

	@Test
	public void shouldGetMemberJoinDate() {
		assertNotNull(mafiaMembersMock.getMemberJoinDate());
	}

	@Test
	public void shouldGetMemberBigBoss() {
		assertNotNull(mafiaMembersMock.getMemberStatus());
	}

	@Test
	public void shouldSetMemberJoinDate() {
		assertTrue(MEMBER_JOIN_DATE.compareTo(mafiaMembersMock.getMemberJoinDate()) == 0);
	}

	@Test
	public void shouldSetMemberName() {
		assertTrue(MEMBER_NAME.equals(mafiaMembersMock.getMemberName()));
	}
	
	@Test
	public void shouldSetMemberStatus() {
		assertTrue(MEMBER_STATUS.equals(mafiaMembersMock.getMemberStatus()));
	}
	
	@Test
	public void shouldSetMemberBigBoss() {
		assertTrue(MEMBER_BIG_BOSS.booleanValue() == mafiaMembersMock.getMemberBigBoss().booleanValue());
	}
}
