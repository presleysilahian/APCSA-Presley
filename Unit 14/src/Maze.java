//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		maze = new int[][]{};

	}

	public Maze(int size, String line)
	{
		

	}

	public boolean hasExitPath(int r, int c)
	{
		if (r>=0 && c>=0 && r<maze.length && c<maze[r].length && maze[r][c] == 1){
			maze[r][c] = 'x';
			
		}
		return false;
	}

	public String toString()
	{
		String output="";





		return output;
	}
}