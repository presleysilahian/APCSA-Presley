//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class WordPrinter
{
	public WordPrinter(String word, int times)
	{
		printWord(word, times);
		
	}
		
	public static void printWord(String word, int times)
	{
		for (int i = 0; i < times; i++){
			System.out.println(word);
		}



	}
}