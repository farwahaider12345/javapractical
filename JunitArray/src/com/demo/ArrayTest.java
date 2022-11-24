package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class ArrayTest {

	private Array array;

	@Before
	public void setUp() throws Exception {
		array = new Array();
	}

	@After
	public void tearDown() throws Exception {
		array = null;
	}

	@Test
	public void testMaxArray() {

		assertEquals(5, array.arr(1, 2, 3, 4, 5));
	}

}
