package com.stratio.entities;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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
public class ImprisonedTimeHierarchyTest {

	private static final Integer IMPRISONED_ID = new Integer(1);
	private static final Integer IMPRISONED_BOSS_ID = new Integer(2);
	private static final Integer IMPRISONED_SUBORDINATE_ID = new Integer(5);
	
	@InjectMocks
	private ImprisonedTimeHierarchy imprisonedTimeHierarchyMock;

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {

	}

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		imprisonedTimeHierarchyMock.setImprisonedId(IMPRISONED_ID);
		imprisonedTimeHierarchyMock.setImprisonedBossId(IMPRISONED_BOSS_ID);
		imprisonedTimeHierarchyMock.setImprisonedSubordinateId(IMPRISONED_SUBORDINATE_ID);
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void type() {
		assertThat(imprisonedTimeHierarchyMock, instanceOf(ImprisonedTimeHierarchy.class));
	}

	@Test
	public void shouldGetImprisonedId() {
		assertNotNull(imprisonedTimeHierarchyMock.getImprisonedId());
	}
	
	@Test
	public void shouldGetImprisonedBossId() {
		assertNotNull(imprisonedTimeHierarchyMock.getImprisonedBossId());
	}
	
	@Test
	public void shouldGetSubordinateId() {
		assertNotNull(imprisonedTimeHierarchyMock.getImprisonedSubordinateId());
	}
	
	@Test
	public void shouldSetBossId() {
		assertTrue(IMPRISONED_BOSS_ID.intValue() == imprisonedTimeHierarchyMock.getImprisonedBossId().intValue());
	}
	
	@Test
	public void shouldSetSubordinateId() {
		assertTrue(IMPRISONED_SUBORDINATE_ID.intValue() == imprisonedTimeHierarchyMock.getImprisonedSubordinateId().intValue());
	}
}
