
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class OuterSpace extends Canvas implements KeyListener, Runnable {
	private Ship ship;
	private Bullets shots;
	private int tick;
	private AlienHorde horde;
	private Alien alienOne;
	private Alien alienTwo;
	private Shield shield;

	/*
	 * uncomment once you are ready for this part
	 *
	 * private AlienHorde horde; private Bullets shots;
	 */

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace() {
		setBackground(Color.black);

		keys = new boolean[5];

		ship = new Ship(400, 500, 35, 35, 2);

		int hordeWidth = 7;
		int hordeHeight = 4;
		int hordeSize = hordeWidth * hordeHeight;

		horde = new AlienHorde(hordeSize);
		shots = new Bullets();
		shield = new Shield();

		for (int x = 8; x < StarFighter.WIDTH - 100; x += (StarFighter.WIDTH) / 8)
			for (int y = 22; y < StarFighter.HEIGHT / 1.5; y += (StarFighter.HEIGHT / 1.5) / 4)
				horde.add(new Alien(x + 20, y, 25, 25, 1));

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and
		// smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50);
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0, 0, 800, 600);

		tick++;

		if (keys[0] == true) {
			ship.move("LEFT");
		}

		if (keys[0] == true) {
			ship.move("LEFT");
		}
		if (keys[1] == true) {
			ship.move("RIGHT");
		}
		if (keys[2] == true) {
			ship.move("UP");
		}
		if (keys[3] == true) {
			ship.move("DOWN");
		}
		if (keys[4] == true) {
			if (tick >= 70) {
				shots.add(new Ammo(ship.getX() + ship.getWidth() / 2 - 2, ship.getY(), 5));
				tick = 0;
			}
		}
		for (int i = 0; i < shots.getAmmo().size(); i++)
			for (int j = 0; j < horde.getAliens().size(); j++)
				if (shots.getAmmo().get(i).isColliding(horde.getAliens().get(j))) {
					shots.getAmmo().remove(i--);
					horde.getAliens().remove(j--);
					horde.decSize();

				}
		for (int i = 0; i < horde.getAliens().size(); i++)
			if (ship.isColliding(horde.getAliens().get(i))) {
				if (horde.getSize() > 18 || horde.getSize() <= 14) {
					System.out.println("You lose.");
					System.exit(0);
				}
			}
		horde.moveEmAll();
		shots.moveEmAll();
		shots.cleanEmUp();
		horde.checkSize();

		if (horde.getSize() == 0) {
			System.out.println("You win!");
			System.exit(0);
		}
		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("" + horde.getSize(), 740, 530);
		ship.draw(graphToBack);
		shield.draw(graphToBack, ship, horde);
		shots.drawEmAll(graphToBack);
		horde.drawEmAll(graphToBack);

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e) {
		// no code needed here
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}
