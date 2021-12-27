import java.util.Scanner;


public class S5_BackNTo1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		//calling the function


		print(1,n);
	}



	public static void print(int i ,int n)
	{
		if(i>n)	return;


		print(i+1, n);	
		System.out.println(i);
	}
}