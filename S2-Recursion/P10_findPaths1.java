import java.util.Scanner;
// printing all the paths in a  m xn  matrix recursion 
// you can go either  right or down
// if go to right movement of column happens
// if go to left movement of row happens
// do not cross boundaries i.e.  rows boundaries(m)    column boundaries(n)    -->base condition1 
// when you reach destination (m-1, n-1) print the string                     -->base condition2


public class P10_findPaths1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();			//no of rows
		int n = sc.nextInt();			//no of cols
		int[][] mat = new int[m][n]; 
		findPaths(0,0,m,n,"");
		System.out.println("End Recursion: ");
	}

	// find all the paths
	static void findPaths(int row,int col,int rLimit,int cLimit, String s)
	{
		// either we cross one of the boundaries we will return
		if(row >= rLimit  ||  col >=cLimit)
			return;

		//base condition when you reach destination print the string and return
		if(row == rLimit-1  && col == cLimit-1)
		{
			System.out.println(s);
			return;
		}

	
		// going to down direction
		s += "D";
		findPaths(row+1,col,rLimit,cLimit,s);
		s = s.substring(0,s.length()-1);

		//going to right direction
		s += "R";
		findPaths(row,col+1,rLimit,cLimit,s);
		s = s.substring(0,s.length()-1);
	}
}