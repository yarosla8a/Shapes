package org.itstep.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrianglTest {

	@Test
	public void testPrintArea() {
		Triangl triangl = new Triangl();
		triangl.setHight(10);
		triangl.setSide(20);
		triangl.printArea();
		String testArea = triangl.getArea();
		assertEquals("100", testArea);
		
		
	}

}
