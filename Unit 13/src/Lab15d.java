//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("C:\\Users\\silahianp1916\\Desktop\\APCSA-Presley\\Unit 13\\src\\lab15d.dat"));
		int size = scan.nextInt();
		FancyWords[] test = new FancyWords[size];
		scan.nextLine();
		for(int i = 0; i < size; i++){
			test[i] = new FancyWords(scan.nextLine());
		}
		for(FancyWords f : test) out.println(f);





	}
}