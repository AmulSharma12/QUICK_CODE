import java.lang.*;
import java.util.Scanner;

public class P11_PrimeFactorsQuery
{
	static int n = 1000000;
	static int[] spf = new int[n+1];
	static void createSieve()
	{
		for(int i=1;i<=n;i++)
		{
			spf[i] = i;
		}

		for(int i=2 ; i*i<=n ; i++)
		{
			if(spf[i] == i)
			{
				for(int j=i*i ; j<=n ; j+=i)
				{
					if(spf[j] == j)
					{
						spf[j] = i;
					}
				}
			}
		}
	}

	public static void main(String[] args)
	{
		createSieve();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int no;
		while(t>0)
		{
			no = sc.nextInt();
			System.out.print(no + " --> ");
			while(no != 1)
			{
				System.out.print(spf[no] + " ");
				no = no/spf[no];
			}
			System.out.print('\n');
			t--;
		}
	}
}