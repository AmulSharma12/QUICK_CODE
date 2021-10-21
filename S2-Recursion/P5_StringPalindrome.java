import java.util.Scanner;

public class P5_StringPalindrome
{
	public static void main(String[] args)
	{
		String str = "madsm";
		boolean palindrome = palindrome(str,0,str.length());
		if(palindrome)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}

	static boolean palindrome(String s,int i,int n)
	{
		if(i>=n/2)
			return true;
		if(s.charAt(i) == s.charAt(n-i-1))
			return palindrome(s,i+1,n);
		return false;
	}
}