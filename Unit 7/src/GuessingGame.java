//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int count;
	private int answer;
	private int randomNumber;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		count = 1;
		randomNumber = (int) (Math.random()*upperBound);
		System.out.print("Enter a number between 1 and " + upperBound);
		answer = keyboard.nextInt();
		if ((answer < 1) || (answer > upperBound)){
			System.out.println("Number is out of range!");
		}
		while (randomNumber != answer) {
			System.out.print("Enter a number between 1 and " + upperBound);
			answer = keyboard.nextInt();
			if ((answer < 1) || (answer > upperBound)){
				System.out.println("Number is out of range!");}
			count += 1;
			}
		}

	public String toString()
	{
		String output=("It took " + count + " guesses to guess " + randomNumber + "\nYou guessed wrong " + (1.0/count)*100.0 + " percent of the time.");
		return output;
	}
}