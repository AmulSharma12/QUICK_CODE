// check whether the String is palindrome or not 

import java.util.Scanner;
public class S9_StringPalindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		boolean isPalindrome = checkPalindrome(s,0,s.length());
		System.out.println(s + " " + isPalindrome);
	}


	public static boolean checkPalindrome(String s, int index, int n)
	{
		if(index >= n/2)
			return true;

		if(s.charAt(index) != s.charAt(n-index-1))
				return false;
		
		return checkPalindrome(s,index+1,n);
	}
}

