//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	// add the other Ball constructors

	public Ball(int x, int y) {
		super(x, y);
		setXSpeed(3);
		setYSpeed(1);
	}

	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		setXSpeed(3);
		setYSpeed(1);
	}

	public Ball(int x, int y, int w, int h, Color col) {
		super(x, y, w, h, col);
		setXSpeed(3);
		setYSpeed(1);
	}

	public Ball(int x, int y, int w, int h, Color col, int xS, int yS) {
		super(x, y, w, h, col);
		setXSpeed(xS);
		setYSpeed(yS);
	}

	// add the set methods
	public void setXSpeed(int xS) {
		xSpeed = xS;
	}

	public void setYSpeed(int yS) {
		ySpeed = yS;
	}

	public void update(Graphics window) {
		setPos(getX() + xSpeed, getY() + ySpeed);
	}

	public boolean equals(Object obj) {
		Ball other = (Ball) obj;
		return super.equals(other) && this.getXSpeed() == other.getXSpeed() && this.getYSpeed() == other.getYSpeed();

	}

	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	// add the get methods

	public String toString() {
		return super.toString() + " " + getXSpeed() + " " + getYSpeed();
	}

	// add a toString() method
}
