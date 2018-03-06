

package org.itstep.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CircleTest {

	@Test
	public void testPrintArea() {
		Circle circle = new Circle();
		circle.setRadius(23);
		circle.printArea();
		String testArea = circle.getArea();
		assertEquals("1661.9025137490005", testArea);
		
		
	}

}
