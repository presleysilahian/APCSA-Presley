//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	private double [] grades;
	private int len;
	
	public Grades()
	{
		
	}
	
	public Grades(int a, double[] arr)
	{
		setGrades(a, arr);
	}

	public void setGrades(int a, double [] arr)
	{
		len = a;
		grades = new double[a];
		for(int i = 0; i< a; i++){
			grades[i] = arr[i];
		}
	}

	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++){
			sum += grades[i];
		}


		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/len;


		return average;
	}


	public String toString()
	{
		String output = "";
		for (int i = 0; i < len; i++){
			output += "grade" + i + " :: " + grades[i] + "\n";
		}
		output += "\n average = " + getAverage();
		return output;
	}



}