import java.util.Scanner;
import java.util.ArrayList;
// rat in a maze
// you can start from (0,0) in a mxn matrix to reach destination (m-1,n-1)
// you can allow to move in 4 direction
// CONSTRAINT : each rat can visit particular index only once  handled by visited array/arraylist

public class P11_findPaths4Dir
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();		//no of rows
		int n = sc.nextInt();       //no of cols
		String str = "";
		int[][] visited = new int[m][n];
		findPaths(0,0,m,n,visited,str);
		System.out.print("End Recursion: ");
	}

	static void findPaths(int row,int col, int rLimit, int cLimit, int[][] vis,String s)
	{
		//base condition to check
		if(row<0  || col<0 || row>=rLimit || col>=cLimit || vis[row][col] == 1 )
			return;

		// Base Condition to reach destination
		if(row == rLimit-1  && col == cLimit-1)
		{
			System.out.println(s);
			return;
		}		

		// marking visited because at the time of calling it mark visit for everyone
		 vis[row][col] = 1;

		// Logic
		 // Going down
		s += "D";
		findPaths(row+1,col,rLimit,cLimit,vis,s);
		s = s.substring(0,s.length()-1);

		// Going Right
		s += "R";
		findPaths(row,col+1,rLimit,cLimit,vis,s);
		s = s.substring(0,s.length()-1);

		// Going Up
		s += "U";
		findPaths(row-1,col,rLimit,cLimit,vis,s);
		s = s.substring(0,s.length()-1);

		// Going Left
		s += "L";
		findPaths(row,col-1,rLimit,cLimit,vis,s);
		s = s.substring(0,s.length()-1);

		// umarking visited array for  all the recursion call
		vis[row][col] = 0;
	}		



}