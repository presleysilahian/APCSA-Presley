//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;


public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200, 200);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y)
	{
		super(x, y);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x, y, w, h);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, Color col)
	{
		super(x, y, w, h, col);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xS, int yS)
	{
		super(x, y, w, h, col);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	
	public void setXSpeed(int xS) {
		xSpeed = xS;
	}
	
	public void setYSpeed(int yS) {
		ySpeed = yS;
	}
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

	public void moveAndDraw(Graphics window)
	{
		Color temp = getColor();
		draw(window, Color.WHITE);
		setPos(getX()+getXSpeed(), getY()+getYSpeed());
		draw(window, temp);
	}

	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		return super.equals(other)
				&& this.getXSpeed() == other.getXSpeed()
				&& this.getYSpeed() == other.getYSpeed();
	}
	
	public boolean didCollideLeft(Wall obj) {
		Wall other = (Wall) obj;
		return this.getX() <= other.getLeft();
	}
	
	public boolean didCollideRight(Wall obj) {
		Wall other = (Wall) obj;
		return this.getX() >= other.getRight();
	}
	
	public boolean didCollideTop(Wall obj) {
		Wall other = (Wall) obj;
		return this.getY() <= other.getTop();
	}

	public boolean didCollideBottom(Wall obj) {
		Wall other = (Wall) obj;
		return this.getY()+9 /*because the bottom wall is screwed up*/ >= other.getBottom();
	}
	public boolean didCollideLeft1(Object obj) {
		Paddle other = (Paddle) obj;
		return this.getX() <= other.getX()-15;
	}
	
	public boolean didCollideRight1(Object obj) {
		Paddle other = (Paddle) obj;
		return this.getX() >= other.getX()+15;
	}
	
	public boolean didCollideTop1(Object obj) {
		Paddle other = (Paddle) obj;
		return this.getY() <= other.getY()+15;
	}

	public boolean didCollideBottom1(Object obj) {
		Paddle other = (Paddle) obj;
		return this.getY() >= other.getY()-15;
	}
	public String toString() {
		return super.toString() +" "+ getXSpeed() +" "+ getYSpeed();
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideLeft1(Paddle obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideRight1(Paddle obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideTop1(Paddle obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideBottom1(Paddle obj) {
		// TODO Auto-generated method stub
		return false;
	}
}