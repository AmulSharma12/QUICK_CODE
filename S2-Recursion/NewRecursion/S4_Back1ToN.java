// printing the number from 1 to n using backtracking
// at returning time we have to print 1 to n  i.e. 			1 2 3 4 (n = 4)


import java.util.Scanner;


public class S4_Back1ToN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// calling the function print 
		print(n);
	}



	public static void print(int n)
	{
		if(n == 0) 	return;


		print(n-1);
		System.out.println(n);

	}
}