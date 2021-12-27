import java.util.Scanner;

public class S6_SumOfN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		//parameterised way  -> function do both process and printing
		sum(n,0);

		//functional way -> function return the result
		int result = sum1(n,0);
		System.out.println(result);
	}


	//parameterised way
	public static void sum(int i, int sum)
	{

		if(i<1)
		{
			System.out.println(sum);
			return;
		}


		sum(i-1,sum+i);
	}



	// functional way
	public static int sum1(int i, int sum)
	{
		if(i<1)		return 0;

		return i + sum1(i-1,sum);
	}
}