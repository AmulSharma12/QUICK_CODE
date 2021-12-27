import java.util.Scanner;


public class S2_Print1ToN
{
	public static void main(String[] java)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		printNo(1,n);
	}


	public static void printNo(int start, int n)
	{
		if(start>n)
			return;

		System.out.println(start);
		printNo(start+1,n);
	}
}