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

public class Lab16e
{
	public static void main( String args[] ) throws IOException
	{
		Histogram test1 = new Histogram(new char[]{'a','b','c'},"C:\\Users\\silahianp1916\\Desktop\\APCSA-Presley\\Unit 10\\src\\lab16e1.dat");
		test1.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+test1.mostFrequent());
		out.println("Letter occurring least : "+test1.leastFrequent());
		out.println("\n");
		out.println(test1);
		
		Histogram test2 = new Histogram(new char[]{'d','e','a'},"C:\\Users\\silahianp1916\\Desktop\\APCSA-Presley\\Unit 10\\src\\lab16e2.dat");
		test2.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+test2.mostFrequent());
		out.println("Letter occurring least : "+test2.leastFrequent());
		out.println("\n");
		out.println(test2);
		
		Histogram test3 = new Histogram(new char[]{'x','a','r','g'},"C:\\Users\\silahianp1916\\Desktop\\APCSA-Presley\\Unit 10\\src\\lab16e3.dat");
		test3.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+test3.mostFrequent());
		out.println("Letter occurring least : "+test3.leastFrequent());
		out.println("\n");
		out.println(test3);


	
	}
}