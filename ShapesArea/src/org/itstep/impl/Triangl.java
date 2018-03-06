package org.itstep.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Triangl implements Shapes {
	private static Logger logger = Logger.getLogger(Squer.class.getName());
	private int side;
	private int hight;

	public void printArea() {
		logger.log(Level.INFO, "Area of this Triangl is" + 1 / 2 * side * hight + "sq.m.");
		// System.out.println("Area of this Triangl is"+ 1 / 2 * side * hight + "sq.m.");

	}

	public String getArea() {
		return String.valueOf(1 /2 * side * hight);

	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}


}
