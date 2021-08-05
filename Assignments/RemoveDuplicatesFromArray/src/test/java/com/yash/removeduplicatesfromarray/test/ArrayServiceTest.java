package com.yash.removeduplicatesfromarray.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.yash.removeduplicatesfromarray.service.ArrayService;

class ArrayServiceTest {

	/*
	 * @BeforeAll static void setUpBeforeClass() throws Exception { }
	 * 
	 * @AfterAll static void tearDownAfterClass() throws Exception { }
	 * 
	 * @BeforeEach void setUp() throws Exception { }
	 * 
	 * @AfterEach void tearDown() throws Exception { }
	 */

	@Test
	void testRemoveduplicates() {
		assertArrayEquals(new int[]{3,1,2,4},ArrayService.removeduplicates(new int[]{ 3,1, 1, 2, 2, 2,4,4 }, 8));
		//assertSame(new int[]{3,1,2,4},ArrayService.removeduplicates(new int[]{ 3,1, 1, 2, 2, 2,4,4 }, 8));
		//assertEquals(new int[]{3,1,2,4},ArrayService.removeduplicates(new int[]{ 3,1, 1, 2, 2, 2,4,4 }, 8));
		//assertEquals(4, ArrayService.removeduplicates(new int[]{ 3,1, 1, 2, 2, 2,4,4 }, 8));
	}

}
