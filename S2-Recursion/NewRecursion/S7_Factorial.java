import java.util.Scanner;


public class S7_Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fact(n,1);
		// int factorial = fact(n);
		// System.out.println(factorial); 
	}



	public static void fact(int n,int fac)
	{
		if(n == 0)
		{
			System.out.println(fac);
			return;
		}
		fact(n-1,fac*n);
	}


	// public static int fact(int n)
	// {
	// 	if(n == 0)	return 1;

	// 	return n * fact(n-1);
	// }
}