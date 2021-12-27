import java.util.Scanner;


public class S1_NTimeName
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		print(n);
	}


	public static void print(int n)
	{
		if(n == 0)
			return;

		System.out.println("Amul Sharma");
		print(n-1);
	}
}