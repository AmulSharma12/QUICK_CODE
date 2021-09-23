import java.lang.*;
import java.util.Scanner;

//In A range 1-10^6 Q query given in each query number given so how many number
// has minimum prime factor in range 1-10^6
public class P8_InRangePrimeFactors
{
	static int n = 1000000;
	static int[] sieve = new int [n+1];
	static void createSieve()
	{
		for(int i=2; i<=n ;i++)
		{
			sieve[i] = 1;
		}

		//O(nlog(logn))
		for(int i = 2; i*i<=n; i++)
		{
			if(sieve[i] == 1)
			{
				for(int j = i*i;j<=n; j+= i)
				{
					sieve[i]++;
					sieve[j] = 0;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		createSieve();
		Scanner sc = new Scanner(System.in);
		int t , number;
		t = sc.nextInt();

		//Test Cases
		while(t != 0)
		{
			//number given should be prime
			number = sc.nextInt();
			System.out.print(sieve[number] + " ");
			t--;
		}
	} 
}