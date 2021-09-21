import java.lang.*;
import java.util.Scanner;

// For t test cases check prime or not
public class P4_CheckPrimeForTCases
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int t,n;
	t = sc.nextInt();

	for(int i=t;;i--)
	{
		n = sc.nextInt();
		if(isPrime(n))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
	}


}

 	static boolean isPrime(int no)
 	{
 		int nof = 0;
 		for(int i=1;i*i<=no;i++)
 		{
 			if(no%i == 0)
 				nof++;
 			if(i!=(no/i))
 				nof++;

 		}

 		if(nof == 2)
 			return true;
 		else 
 			return false;
 	}
}