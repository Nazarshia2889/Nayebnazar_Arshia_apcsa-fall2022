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

public class Bullets
{
	private List<Ammo> ammos;

	public Bullets()
	{
		ammos = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammos.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for(Ammo ammo: ammos) {
			
			ammo.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Ammo ammo: ammos) {
			ammo.move("UP");
		}
	}

	public void cleanEmUp()
	{
		for(int i = 0; i < ammos.size(); i++) {
			if(ammos.get(i).getY() < 0) {
				ammos.remove(i);
			}
		}
	}

	public List<Ammo> getList()
	{
		return ammos;
	}

	public String toString()
	{
		return "";
	}
}
