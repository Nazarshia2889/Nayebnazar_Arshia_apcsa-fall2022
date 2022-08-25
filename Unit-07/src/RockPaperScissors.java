//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int num = (int) (Math.random() * 3) + 1;
		switch(num){
			case 1:
				compChoice = "R";
				break;
			case 2:
				compChoice = "P";
				break;
			case 3:
				compChoice = "S";
				break;
		}
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice.equals(compChoice)) {
			winner = "tie";
		}
		else if((playChoice.equals("R") && compChoice.equals("S")) || 
				playChoice.equals("P") && compChoice.equals("R") ||
				playChoice.equals("S") && compChoice.equals("P")) {
			winner = "Player";
		}
		else {
			winner = "Computer";
		}
		return winner;
	}

	public String toString()
	{
		String output = "";
		if(determineWinner().equals("tie")) {
			output = "It' a tie!";
		}
		else if(determineWinner().equals("Player")) {
			output= "Player wins! " + "<<" + playChoice + " beats " + compChoice + ">>";
		}
		else {
			output= "Computer wins! " + "<<" + compChoice + " beats " + playChoice + ">>";
		}
		return output;
	}
}