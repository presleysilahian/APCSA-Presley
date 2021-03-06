//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
public class Wordy implements Comparable<Wordy>
{
	private String word;

	public Wordy( String s)
	{
		word = s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		Scanner scan = new Scanner(vowels);
		Scanner wordy = new Scanner(word);
		for (int i = 0; i < word.length(); i++){
			for (int j = 0; j < vowels.length(); j++){
				if (scan.next().charAt(j) == wordy.next().charAt(i)){
					vowelCount++;
				}
			}
		}


		return vowelCount;
	}

	public int compareTo(Wordy rhs)
	{
		Wordy other = (Wordy)rhs;
		if(numVowels() < other.numVowels()) return 1;
		if(numVowels() > other.numVowels()) return -1;
		for (int i = 0; i < word.length(); i++){
			if ((int)word.charAt(i) < (int)other.toString().charAt(i)){
				return 1;
			}
			else if ((int)word.charAt(i) > (int)other.toString().charAt(i)){
				return -1;
			}
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}