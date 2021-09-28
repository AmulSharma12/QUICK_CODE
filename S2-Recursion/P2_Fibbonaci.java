import java.lang.*;
import java.util.Scanner;

public class P2_Fibbonaci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int ans  = fib(number);
		System.out.print(ans);
	}

	static int fib(int n)
	{
		int l,r;
		if(n==0 || n==1)
			return n;

		l = fib(n-2);
		r = fib(n-1);
		
		return l + r;
	}
}