//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		String keepPlaying;
		
		//add in a do while loop after you get the basics up and running
		do {
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
			game.setPlayers(keyboard.next());
			game.determineWinner();
			System.out.println(game);
			
			System.out.println("Do you want to keep playing? (y/n)");
			keepPlaying = keyboard.next();
		} while(keepPlaying.equals("y"));
	}
}



