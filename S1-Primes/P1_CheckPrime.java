import java.lang.*;
import java.util.Scanner;
class P1_CheckPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nof = 0;
		// any number divide by 1 and itself only that means only 2 factors
		for(int i=1;i<=n;i++)
		{
			if(n%i == 0)
				nof++;
		}

		if(nof == 2)	System.out.println("Prime");
		else   			System.out.println("Not Prime");

	}
}