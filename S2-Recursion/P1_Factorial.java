import java.lang.*;
import java.util.Scanner;

public class P1_Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fac = fac(number);
		System.out.print(fac);
	}

	static int fac(int n)
	{
		if(n==0 || n==1)
			return n;

		return n*fac(n-1);
	}
}