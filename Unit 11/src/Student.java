//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		myName = name;
		myGrades = new Grades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades.setGrades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		double average = 0.0;
		average = myGrades.getSum()/myGrades.getNumGrades();
		return average;
	}

	public double getAverageMinusLow()
	{
		double newsum = 0.0;
		double newavg = 0.0;
		newsum = myGrades.getSum() - myGrades.getLowGrade();
		newavg = newsum/myGrades.getNumGrades();
		return newavg;
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();	
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	@Override
	public int compareTo(Student param)
	{
		if(getAverage()>param.getAverage()){
			return 1;}
		else if (getAverage()<param.getAverage()){
			return -1;}
		return 0;
	}
	public String toString()
	{
		return "";
	}	
}