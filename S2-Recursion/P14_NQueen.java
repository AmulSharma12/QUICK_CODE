import java.util.Scanner;

// NQueen Problems
// Queen can move in all the direction
// In nxn board you have to place n queens such that 3 condition must follows
// 1. each column should have exact one queen
// 2. each row should have exact one queen
// 3. queen should not kill another queen
// QUESTION PRINT ONLY SINGLE VALID CONFIGURATION

// Function start
// BASE CONDITON  GUIDE
// 1.we call column and try to place queen in each row if it is safe
// 2.if place the queen as 1 we call again to next column 
// 3.if we are able to reach the col==n means we are succesfully placed in each col 1 queen
// 4.CONCLUSION  col==n becomes base case and if we reach base case print and return with true 
// as we have to print only single configuration

// NQueen Logic  GUIDE
// in every column we should try to place every possibilites of row so for loop used
// if safe we place queen and call to next column  
// and at the returning time we will undo i.e.unplace queen
// for new fresh call 
// if unable to place in any row return with saying false after checking all the row


// isSafe function guide
// queen can move in all the directioon and can kill another queen
// logically thinks do we have to check all the direction
// if we are standing in some column 
// a. is there any possibilities of queen in all right direction as we are placing queen from left to right
// b. is there any possibilities of queen in up direction as we have already checked that row 
// and if we are place in that upper row my call should made for the next col
// c. also no need to check down direction as we are in particular col and in that row
// and it is obvious there is no queen placed if 
// Only check all the 3 directions of right bcoz there is all the chance of killing other queens
public class P14_NQueen
{
	// Main method
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		NQueen2(0,matrix);
		System.out.println("End Recursion: ");
	}


	// isSafe Function
	static boolean isSafe(int row,int col,int[][] mat)
	{
		//1st diagonal guide
		for(int i=row,j=col; i>=0 && j>=0; i--,j--)
		{
			if(mat[i][j] == 1)
				return false;
		} 

		//  row guide    <----
		for(int i=row,j=col; j>=0; j--)
		{
			if(mat[i][j] == 1)
				return false;
		}

		// 3rd diagonal guide
		for(int i=row,j=col; i<mat.length && j>=0; i++,j--)
		{
			if(mat[i][j] == 1)
				return false;
		}

		// if no of queen kill another queen  then we returns with true
		return true;
	} 



	// Printing single valid configuration
	static boolean NQueen(int col,int[][] mat)
	{
		 // Base case ->GUIDE  only reach when we succesfully able to place 1 queen in each col
		if(col == mat.length)
		{
			System.out.println("Queen able to placed in all the cells ");
			// Printing matrix we have placed the queen
			for(int i = 0; i<mat.length; i++)
			{
				for(int j = 0; j<mat.length; j++)
				{
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();
			}
			return true;
		}


		// NQueen logic ->GUIDE
		for(int row = 0; row<mat.length; row++)
		{
			if(isSafe(row,col,mat))
			{ 
				mat[row][col] = 1;
				if(NQueen(col+1,mat) == true) return true;                                   //NQueen call
				mat[row][col] = 0;
			}
		}
		return false;

	}


	// printing all the valid configuration you dont have to return from base case
	// now you have to print all the valid configuration  and also you dont have to return from call of function
	static void NQueen2(int col,int[][] mat)
	{
		 // Base case ->GUIDE  only reach when we succesfully able to place 1 queen in each col
		if(col == mat.length)
		{
			System.out.println("Queen able to placed in all the cells ");
			// Printing matrix we have placed the queen
			for(int i = 0; i<mat.length; i++)
			{
				for(int j = 0; j<mat.length; j++)
				{
					System.out.print(mat[i][j] + " ");
				}
				System.out.println("-----------------------------------------------------------------");
			}
			return;
			// return true;             ->remove in order to print all the case  we dont have to return
		}


		// NQueen logic ->GUIDE
		for(int row = 0; row<mat.length; row++)
		{
			if(isSafe(row,col,mat))
			{ 
				mat[row][col] = 1;
				NQueen2(col+1,mat);	 //NQueen call  ->dont have to return from function call
				mat[row][col] = 0;
			}
		}
		

	}



	// Exit all the function



}



