import java.lang.*;
import java.util.Scanner;

public class P2_OptPrime
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int nof = 0;


	   //Optimised O(sqrt(n)) solution for checking Primes
		for(int i=1;i*i<=n;i++)
		{
		  if(n%i == 0)
		  {
		  	nof++;
		  	if(i!=(n/i))
		  		nof++;
		  }
		}

		if(nof == 2) System.out.println("Prime");
		else    	 System.out.println("Not Prime");

	}
} 