package com.stratio.services.impl;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

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

import com.stratio.entities.CurrentHierarchy;
import com.stratio.entities.MafiaMembers;
import com.stratio.repositories.CurrentHierarchyRepo;

@RunWith(MockitoJUnitRunner.class)
public class CurrentHierarchyServiceImplTest {

	private static final Integer CURRENT_HIERARCHY_ID = new Integer(80);
	private static final Integer BOSS_ID = new Integer(100);
	private static final Integer SUBORDINATE_ID = new Integer(102);

	@InjectMocks
	private CurrentHierarchyServiceImpl currentHierarchyServiceImplMock;

	@Mock
	private CurrentHierarchyRepo currentHierarchyRepoMock;

	private CurrentHierarchy currentHierarchyMock = new CurrentHierarchy();

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
	public void shouldABecomesABossOfB() {
		when(currentHierarchyServiceImplMock.ABecomesABossOfB(currentHierarchyMock)).thenReturn(currentHierarchyMock);
		assertNotNull(currentHierarchyServiceImplMock.ABecomesABossOfB(currentHierarchyMock));
		assertThat(currentHierarchyServiceImplMock.ABecomesABossOfB(currentHierarchyMock), instanceOf(CurrentHierarchy.class));
	}
}
