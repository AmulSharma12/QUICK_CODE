import java.lang.*;
import java.util.Scanner;

public class P6_OptimizedSieve{

	//Creating Sieve PreComputing Technique
	static int n = 1000000;
	static boolean[] sieve = new boolean[n+1];

	static void createSieve(){
		for(int i=2;i<=n;i++){
			sieve[i] = true;
		}

		for(int i = 2 ; i*i<=n ; i++){
			if(sieve[i] == true){
				for(int j = i*i ; j<=n ; j += i){
					sieve[j] = false;
				}
			}
		}
	}



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		createSieve();
		int n;
		int t = sc.nextInt();
		for(int start = t ; start > 0 ; start--)
		{
			n = sc.nextInt();
			if(sieve[n] == true)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}

	}
}