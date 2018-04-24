//� A+ Computer Science  -  www.apluscompsci.com
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
import java.util.Arrays;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (Ammo al : ammo)
			al.draw(window);
	}

	public void moveEmAll()
	{
		for (Ammo al : ammo)
			al.move("UP");
	}

	public void cleanEmUp()
	{
		for (int i = 0; i < ammo.size(); i++)
			if (ammo.get(i).getY() < 0)
				ammo.remove(i);
	}

	public List<Ammo> getList()
	{
		return null;
	}

	public String toString()
	{
		return Arrays.toString(ammo.toArray());
	}
}
