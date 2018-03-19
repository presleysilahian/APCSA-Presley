//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}

	public int compareTo( Word rhs )
	{
		if(this.toString().length() > rhs.toString().length()){
			return 1;
		}
		else if(this.toString().length() < rhs.toString().length()){
			return -1;
		}
		else{
			return this.toString().compareTo(rhs.toString());
		}
	}

	public String toString()
	{
		return word;
	}
}