//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<String> stuff = new ArrayList<String>();
		Scanner scanny = new Scanner(new File("C:\\Users\\silahianp1916\\Desktop\\APCSA-Presley\\Unit 12\\src\\lab18e.dat"));
		int num = scanny.nextInt();
		scanny.nextLine();
		while (scanny.hasNextLine())
		{
			stuff.add(scanny.nextLine());
		}
		
		for (int i = 0; i < num; i++){
			Wordy papa = new Wordy(stuff.get(i));
			for (int j = 0; j <i; j++){
				Wordy mother = new Wordy(stuff.get(j));
				if (papa.compareTo(mother)==1){
					String wank = papa.toString();
					String dank = mother.toString();
					stuff.set(i, mother.toString());
					stuff.set(j,  papa.toString());
				}
			}
		}
		for (int i = 0; i < stuff.size(); i++){
			out.println(stuff.get(i));
		}











	}
}