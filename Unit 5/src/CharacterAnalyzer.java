//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar(' ');

	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if((int)theChar >= 65 && (int)theChar <=90){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isLower( )
	{
		if((int)theChar >= 97 && (int)theChar <= 122){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		if((int)theChar >= 48 && (int)theChar <= 57){
			return true;
		}
		else{
			return false;
		}
	}			

	public int getASCII( )
	{
		int num1 = (int)theChar;
		return num1;
	}

	public String toString()
	{
		if (isUpper()){
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		}
		else if (isLower()){
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		}
		else if (isNumber()){
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		else {
			return "returning default";
		}
	}
}