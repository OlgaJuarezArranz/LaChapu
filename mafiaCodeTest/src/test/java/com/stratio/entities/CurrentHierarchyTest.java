package com.stratio.entities;

import static org.hamcrest.CoreMatchers.instanceOf;
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

@RunWith(SpringRunner.class)
public class CurrentHierarchyTest {

	private static final Integer CURRENT_HIERARCHY_ID = new Integer(1);
	private static final Integer BOSS_ID = new Integer(2);
	private static final Integer SUBORDINATE_ID = new Integer(5);
	
	@InjectMocks
	private CurrentHierarchy currentHierarchyMock;

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {

	}

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		currentHierarchyMock.setCurrentHierarchyId(CURRENT_HIERARCHY_ID);
		currentHierarchyMock.setBossId(BOSS_ID);
		currentHierarchyMock.setSubordinateId(SUBORDINATE_ID);
	}
	
	@After
	public void tearDown() {
	}

	@Test
	public void type() {
		assertThat(currentHierarchyMock, instanceOf(CurrentHierarchy.class));
	}

	@Test
	public void shouldGetCurrentHierarchyId() {
		assertNotNull(currentHierarchyMock.getCurrentHierarchyId());
	}
	
	@Test
	public void shouldGetBossId() {
		assertNotNull(currentHierarchyMock.getBossId());
	}
	
	@Test
	public void shouldGetSubordinateId() {
		assertNotNull(currentHierarchyMock.getSubordinateId());
	}
	
	@Test
	public void shouldSetBossId() {
		assertTrue(BOSS_ID.intValue() == currentHierarchyMock.getBossId().intValue());
	}
	
	@Test
	public void shouldSetSubordinateId() {
		assertTrue(SUBORDINATE_ID.intValue() == currentHierarchyMock.getSubordinateId().intValue());
	}
}
