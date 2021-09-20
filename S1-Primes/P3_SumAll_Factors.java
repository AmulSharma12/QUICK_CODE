import java.lang.*;
import java.util.Scanner;

class P3_SumAll_Factors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for(int i=1; i*i<=n; i++)
		{
			if(n%i == 0)
			{
				sum += i;
				if(i != (n/i))
					sum += (n/i);
			}
		}

		System.out.print("Sum Of All The Factors " + sum);
	}
}