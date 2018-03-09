//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{




	}

	public Histogram(char[] values, String fName)
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		fileName = fName;
		for(int i = 0; i < values.length; i++){
			letters.add(values[i]);
			count.add(0);
		}
		out.println("search letters = "+letters);
		
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		try{
			Scanner scan = new Scanner(new File(fileName));
			int numLines = scan.nextInt();
			scan.nextLine();
			for(int i = 0; i < numLines; i++){
				String ln = scan.nextLine();
				for(int j = 0; j < letters.size(); j++){
					for(int k = 0; k < ln.length(); k++){
						if(ln.charAt(k) == letters.get(j)){
							count.set(j, count.get(j) + 1);
						}
					}
				}
			}
				
			
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}

	public char mostFrequent()
	{
		int a = 0;
		char c = letters.get(0);
		for(int i = 0; i < letters.size(); i++){
			if(count.get(i) > a){
				c = letters.get(i);
				a = count.get(i);
			}
		}
		return c;
		
	}

	public char leastFrequent()
	{
		int a = Integer.MAX_VALUE;
		char c = letters.get(0);
		for(int i = 0; i < letters.size(); i++){
			if(count.get(i) < a){
				c = letters.get(i);
				a = count.get(i);
			}
		}
		return c;
		
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
