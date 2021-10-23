import java.util.Scanner;
public class TipsRecursion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Tips Recursion In Java");
	}
}

// Tips and Tricks in Recursion

// Tip 1 -> Printing all the valid configuration in java
// return type should void
// once base case hits print and return;


// Tip 2 -> Printing single configuration in java
// return type should boolean either true or false
// if base condition hits and a.if condition satisfies returs with true
// b.if condition not satisfies returns with false
// also from function call you have to return with either with true/false
// if true is coming while returning you also from function itself returns with true
// if true if not coming while returning you should not do anything 
// if(f() == true)
// 	return true;


// Tips 3 ->counting with base case in recursion
// Without using global/local variable used
// if base condition hits and if condition meets up return with 1
// if condition not meets up inside base case return with 0
// if(basecondition)
// {
// 	if(yourcondition)
// 		return 1;
// 	else
// 		return 0;
// }
// and store from where you called
// l = f();
// r = f();
// return l+r;
// and can perform operation basically addition


