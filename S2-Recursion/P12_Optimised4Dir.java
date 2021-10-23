import java.util.Scanner;
// now we are repeating the lines of code instead of that we can have string containing all
 // direction and we take one by one
// and run in a for loop for each direction
// also there is movement of row array which denotes at particular index of string how much row affected
// also there is movement of col array which denotes at particular index of string how much col affected
// example  s="DLUR"  
// for down (row+1,col+0)
// at 0 index of row and col row={+1,+0}
// rMoves={+1,+0,-1,+0}  wrt string
// cMoves={+0,-1,+0,+1} wrt string


public class P12_Optimised4Dir
{
	static String s = "DRUL";
	static int[] rMoves = {+1,+0,-1,+0};
	static int[] cMoves = {+0,+1,+0,-1};

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();  //no of rows
		int n = sc.nextInt();   // no of cols
		int[][] visited = new int[m][n];
		String str = "";
		findPaths(0,0,m,n,visited,str);
		System.out.println("End Recursion: ");
	}

	static void findPaths(int row, int col, int rLimit, int cLimit,int[][] vis,String str)
	{
		//checking boundaries/already visited   if then any of them true return it    using or
		if(row<0 || col<0  ||  row>=rLimit  || col>=cLimit  || vis[row][col] == 1)
			return;

		//when reach destination print and return it from here
		if(row == rLimit-1  && col == cLimit-1)
		{
			System.out.println(str);
			return;
		}

		
		// Logic
		vis[row][col] = 1;
		for(int x = 0; x<4; x++)
		{
			str += s.charAt(x);
			findPaths(row+rMoves[x],col+cMoves[x],rLimit,cLimit,vis,str);
			str = str.substring(0,str.length()-1);
		}
		vis[row][col] = 0;
	}



	//Printing Lexicographical order means printing in dictonary order  so how you can achieve it
	// so basically we know left child of extreme left subtree will first completely execute means we have 
	// to call in sorted/dictonary order in order to print in that order
	// and same with string you have all character arranged in dictonary order 
}

