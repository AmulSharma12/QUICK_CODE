import java.util.Scanner;
// all 3 directions  will be hashed will hash row and both the diagonals 


// will create rowhash and if already marked i.e.1  will return with false otherwise true
// will create firstHash and if already marked i.e.1 will return with false otherwise true
// will create thirdHash and if already marked i.e.1 will return with false otherwise true
public class P15_OptimisedNQueen
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		int[] rowHash = new int[n];
		int[] firstHash = new int[2*n-1];
		int[] thirdHash = new int[2*n-1];
		NQueen(0,matrix,rowHash,firstHash,thirdHash);
		System.out.println("End Of Recursion : ");
	}

    // issafe function
    static boolean isSafe(int row,int col, int[][] mat,int[] rHash,int[] fHash,int[] tHash)
    {
    	// Reduces from O(3*n)~O(n) to O(1)
    	if(rHash[row] == 1 ||  fHash[mat.length-1+row-col] == 1 || tHash[row+col] == 1)
    		return false;
    	return true;
    }

    // NQueen function
	static boolean NQueen(int col,int[][] mat,int[] rowHash, int[] firstHash, int[] thirdHash)
	{
		// base condition
		if(col == mat.length)
		{
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

		// NQueen Logic
		for(int row = 0; row<mat.length; row++)
		{
			if(isSafe(row,col,mat,rowHash,firstHash,thirdHash))
			{
				mat[row][col] = 1;
				rowHash[row] = 1;
				firstHash[mat.length-1+row-col] = 1;
				thirdHash[row+col] = 1;
				if(NQueen(col+1,mat,rowHash,firstHash,thirdHash) == true)  return true;
				thirdHash[row+col] = 0;
				firstHash[mat.length-1+row-col] = 0;
				rowHash[row] = 0;
				mat[row][col] = 0;
			}
		}

		return false;
	}
}