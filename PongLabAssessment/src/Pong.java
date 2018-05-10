//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
//import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.Font;




public class Pong extends Canvas implements KeyListener, Runnable
{	
	/**
	 * IF YOU WANT TO PLAY     ACCELERATING BALL  	TYPE 'a' IN "PLAY" INSTANCE
	 * IF YOU WANT TO PLAY    COLOR-CHANGING BALL	TYPE 'c' IN "PLAY" INSTANCE
	 * IF YOU WANT TO PLAY       REGULAR BALL       TYPE 'r' IN "PLAY" INSTANCE
	 */
	
	char play = 'r';
	

	private static final long serialVersionUID = 1L;
	
	private Ball ball;
	private Paddle Paddle;
	private Wall wall;
	
	private int timer = 0;
	
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;	

	//starting position of ball
	private static final int BALL_Xi = 380;
	private static final int BALL_Yi = 265;
	
	public Pong()
	{
		createBall();
		
		//set up variables
		Paddle = new Paddle(350, 244, 40, 40, Color.RED, 4);
		wall = new Wall(0, 770, 10, 550);
		keys = new boolean[4];
		
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
	//REFACTORING METHODS
	public void createBall() {
		if(play == 'a') ball = new SpeedUpBall(BALL_Xi, BALL_Yi, 10, 10, Color.BLUE, 1, 1);
		else if(play == 'r') ball = new Ball(BALL_Xi, BALL_Yi, 10, 10, Color.BLUE, 3, 1);
	}
	
	public void subIncSpeed() {
		timer++;
		if(timer == 4) {
			timer = 0;
		}
	}
	
	public void update(Graphics window){
		paint(window);
	}

   	public void paint(Graphics window)
   	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		//take a snap shop of the current screen and save it as an image
		//that is the exact same width and height as the current screen
		if(back == null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		

		//draw objects
		ball.moveAndDraw(graphToBack);
		Paddle.draw(graphToBack);
		
		//draw lower wall
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawLine(0, wall.getBottom(), 800, wall.getBottom());
		
		//draw scoring
		graphToBack.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		graphToBack.clearRect(52, 556, 708, 248);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Player 1 Score: "+ leftScore + 
				"                                       " + 
				"Player 2 Score: "+ rightScore, 120, 590);
			
		//IF BALL COLLIDE LEFT OR RIGHT
		if(ball.didCollideLeft(wall) || ball.didCollideRight(wall)) {
			ball.setXSpeed(-ball.getXSpeed());
			}
			
			
		//IF BALL COLLIDE UP OR DOWN
		if(ball.didCollideBottom(wall) || ball.didCollideTop(wall)){
			ball.setYSpeed(-ball.getYSpeed());
			}
		
	
		if(ball.getX() >= Paddle.getX()-Paddle.getWidth()
				&& ball.getY() >= Paddle.getY()
				&& (ball.getY() <= Paddle.getY()+Paddle.getHeight()
				|| ball.getY()+ball.getHeight() >= Paddle.getY()
				&& ball.getY()+ball.getHeight() < Paddle.getY()+Paddle.getHeight()))
		{
			//no idea what this is
			if(ball.getX() >= Paddle.getX()-Paddle.getWidth()+Math.abs(ball.getXSpeed()))
				ball.setYSpeed(-ball.getYSpeed());
			//make ball bounce
			else
				ball.setXSpeed(-ball.getXSpeed());
			if(play == 'a') subIncSpeed();
		}
			
		//MOVEMENT FOR PADDLES
		if(keys[0] == true) {//right player
			Paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true) {//right player
			Paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[2] == true) {//right player
			Paddle.moveDownAndDraw(graphToBack);
		}
		if(keys[3] == true) {//right player
			Paddle.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
   	}
  	
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'A' : keys[1]=true; break;
			case 'S' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'A' : keys[1]=false; break;
			case 'S' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
   	
   	//PROGRAM RUNNER
  	public void run()
  	{
  		try 
  		{
  			while(true) 
  			{
	  			Thread.currentThread();
				Thread.sleep(8);
				repaint();
	  		}
	  	} catch (Exception e){
	  		System.out.println("oops");
	  	}
    }
}