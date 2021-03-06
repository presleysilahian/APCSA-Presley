//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
	private int speed;

	public Paddle()
	{
		super(40,40);
		setSpeed(5);
	}

	public Paddle(int x, int y) {
		super(x, y);
		setSpeed(5);
	}
	
	public Paddle(int x, int y, int s) {
		super(x, y);
		setSpeed(s);
	}
	
	public Paddle(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		setSpeed(s);
	}
	
	public Paddle(int x, int y, int w, int h, Color col, int s) {
		super(x, y, w, h, col);
		setSpeed(s);
	}
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}  
	public boolean equals(Object obj)
	{
   		Paddle other = (Paddle) obj;
   		return super.equals(other) 
				&& this.getSpeed() == other.getSpeed();	
	}
   
	public String toString() {
		return super.toString() +" "+ getSpeed();
	}
}