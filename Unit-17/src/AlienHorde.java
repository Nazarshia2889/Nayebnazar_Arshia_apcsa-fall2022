//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

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
	private int x = 0;
	private int y = 50;

	public AlienHorde(int size)
	{
		
		aliens = new ArrayList<Alien>();
		for(int i = 0; i < size; i++) {
			if(x > 750) {
				x = 0;
				y += 50;
			}
			aliens.add(new Alien(x += 50, y, 30, 30, 2));
		}
	}

	public void add(Alien al)
	{
		if(x > 750) {
			x = 0;
			y += 30;
		}
		aliens.add(new Alien(x += 50, y, 30, 30, 10));
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien alien: aliens) {
			alien.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Alien alien: aliens) {
			alien.move("RIGHT");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0; i < aliens.size(); i++) {
			for(int j = 0; j < shots.size(); j++) {
				if((shots.get(j).getX() >= aliens.get(i).getX() && shots.get(j).getX() <= aliens.get(i).getX() + aliens.get(i).getWidth()
				&& shots.get(j).getY() >= aliens.get(i).getY() && shots.get(j).getY() <= aliens.get(i).getY() + aliens.get(i).getHeight())) {
					aliens.remove(i);
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
