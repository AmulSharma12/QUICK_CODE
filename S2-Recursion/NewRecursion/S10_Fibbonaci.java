// calculate fibbonci nth 
// fibbonaci sequence of series of sum of two previous terms
// first two terms are fixed fib(0) = 0   fib(1) = 1
// 0 1 1 2 3 5 8 

import java.util.Scanner;


public class S10_Fibbonaci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = fib(n);

		System.out.println(result);
	}


	public static int fib(int n)
	{
		if(n == 0  ||	n == 1)
			return n;

		int l = 0;
		int r = 0;
		l = fib(n-1);
		r = fib(n-2);
		return l+r;
	}
}