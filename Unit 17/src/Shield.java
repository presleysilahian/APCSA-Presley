import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class Shield {

	private BufferedImage image;

	public Shield() {
		try {
			URL url = getClass().getResource("shield.png");
			image = ImageIO.read(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void draw(Graphics window, Ship ship, AlienHorde horde) {
		if (!(horde.getSize() > 18 || horde.getSize() <= 14)) {
			window.drawImage(image, ship.getX(), ship.getY(), ship.getWidth(), ship.getHeight(), null);
		}
	}
}
