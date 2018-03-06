package org.itstep.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Squer implements Shapes {
	private static Logger logger = Logger.getLogger(Squer.class.getName());

	private int side;

	public void printArea() {
		logger.log(Level.INFO, "Area of this Squer is" + side * side + "sq.m.");
		// System.out.println("Area of this Squer is" + side * side + "sq.m.");

	}

	public String getArea() {
		return String.valueOf(side * side);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}


}
