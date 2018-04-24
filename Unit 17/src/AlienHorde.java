//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int size;
	private int tick;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		this.size = size;
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien al : aliens)
			a1.draw(window);
	}

	public void moveEmAll()
	{
		tick++;
		for (Alien al : aliens){
			if (tick <= 120)
				al.move("RIGHT");
			else if (tick <= 320)
				al.move("DOWN");
			else if (tick <= 440)
				al.move("LEFT");
			else if (tick <= 640)
				al.move("UP");
			else if (tick <= 1000)
				tick = 0;
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
		for (int i = 0; i < shots.size(); i++)
			for (int j = 0; j < aliens.size(); j++)
				try {
					if (shots.get(i).isCollidingMT(aliens.get(j))) {
						shots.remove(i);
						aliens.remove(j);
						size--;
					}
				} catch (Exception e) {
				}
		}	

	public String toString()
	{
		return "";
	}
}
