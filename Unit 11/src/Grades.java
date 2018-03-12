//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner scan = new Scanner(gradeList);
		int num = scan.nextInt();
		grades = new double[num];
		String sub = "" + num;
		String test = gradeList.substring(sub.length() + 3);
		scan = new Scanner(test);
		int counter = 0;
		while(scan.hasNextDouble()){
			grades[counter] = scan.nextDouble();
			counter++;
		}

	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++)
		{
			sum += grades[i];
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		low = grades[0];
		for (int i = 0; i < grades.length; i++){
			if (grades[i]<low)
			{
				low = grades[i];
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		high = grades[0];
		for (int i = 0; i < grades.length; i++){
			if (grades[i]>high)
			{
				high = grades[i];
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		
		String output= "";
		for (int i = 0; i < grades.length; i++){
			output+= grades[i] + " ";
		}
		return output;
	}	
}