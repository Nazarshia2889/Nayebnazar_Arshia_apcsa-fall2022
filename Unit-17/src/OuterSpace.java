//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
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

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	
	private Ammo ammo;

	/* uncomment once you are ready for this part
	 *
   private AlienHorde horde;
	private Bullets shots;
	*/
	
	private AlienHorde horde;
	private Bullets shots;

	private boolean[] keys;
	private BufferedImage back;
	
	boolean going = true;


	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(300, 500, 50, 50, 5);
//		
//		alienOne = new Alien(50, 50, 30, 30, 10);
//		alienTwo = new Alien(400, 100, 30, 30, 10);
//		
//		ammo = new Ammo(300, 500, 5);
		horde = new AlienHorde(40);
		shots = new Bullets();

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		if(going) {
			//set up the double buffering to make the game animation nice and smooth
			Graphics2D twoDGraph = (Graphics2D)window;
	
			//take a snap shop of the current screen and same it as an image
			//that is the exact same width and height as the current screen
			if(back==null)
			   back = (BufferedImage)(createImage(getWidth(),getHeight()));
	
			//create a graphics reference to the back ground image
			//we will draw all changes on the background image
			Graphics graphToBack = back.createGraphics();
	
			graphToBack.setColor(Color.BLUE);
			graphToBack.drawString("StarFighter ", 25, 50 );
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(0,0,800,600);
	
			if(keys[0] == true)
			{
				ship.move("LEFT");
			}
			else if(keys[1] == true) {
				ship.move("RIGHT");
			}
			else if(keys[2] == true) {
				ship.move("UP");
			}
			else if(keys[3] == true) {
				ship.move("DOWN");
			}
			
			if(keys[4] == true) {
				shots.add(new Ammo(ship.getX(), ship.getY(), 5));
				keys[4] = false;
			}
			
			ship.draw(graphToBack);
			
			
			
	
			//add code to move Ship, Alien, etc.
			shots.moveEmAll();
			horde.moveEmAll();
			
			shots.drawEmAll(graphToBack);
			horde.drawEmAll(graphToBack);
			
			
			
			shots.cleanEmUp();
			horde.removeDeadOnes(shots.getList());
			
			if(horde.getHorde().size() == 0) {
				graphToBack.setColor(Color.green);
				graphToBack.drawString("Ship won", 300, 300);
				going = false;
			}
	
	
			//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
			
			for(Alien alien : horde.getHorde()) {
				if((ship.getX() >= alien.getX() && ship.getX() <= alien.getX() + alien.getWidth() - 10
					&& ship.getY() >= alien.getY() && ship.getY() <= alien.getY() + alien.getHeight() - 10)) {
					graphToBack.setColor(Color.red);
					graphToBack.drawString("GAME OVER", 300, 300);
					going = false;
								
				}
			}
			
	
			twoDGraph.drawImage(back, null, 0, 0);
		}
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

