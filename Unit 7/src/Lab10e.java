//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = ' ';
		do{
			System.out.print("Guessing Game - How many numbers?");
			int nums = keyboard.nextInt();
			GuessingGame game = new GuessingGame(nums);
			game.playGame();
			System.out.println(game.toString());
			System.out.println("Do you want to play again?");
			response = keyboard.next().charAt(0);}
		while (response == 'y');

	}
}