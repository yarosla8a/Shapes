package org.itstep.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquerTest {

	@Test
	void testPrintArea() {
		Squer squer = new Squer();
		squer.setSide(15);
		squer.printArea();
		String testArea = squer.getArea();
		assertEquals("225", testArea);

	}

}
