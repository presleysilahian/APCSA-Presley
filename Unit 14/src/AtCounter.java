//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private int first;
   private int second;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		if (atCount == 0){
			first = r;
			second = c;
		}
		
		if (r>= 0 && c>= 0 && r< atMat.length && c<atMat[r].length && atMat[r][c] == '@'){
			atCount ++;
			atMat[r][c] = 'x';
			countAts(r+1,c);
			countAts(r-1,c);
			countAts(r,c+1);
			countAts(r,c-1);
		}
		return atCount;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output= first + " " + second + " ";
		output+= getAtCount()+" @s connected.";
		return output;
	}
}