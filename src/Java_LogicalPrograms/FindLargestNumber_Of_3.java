package Java_LogicalPrograms;

import java.util.Scanner;

public class FindLargestNumber_Of_3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		
		System.out.println("Enter second number");
		int b = scan.nextInt();
		
		System.out.println("Enter second number");
		int c = scan.nextInt();
		
		//By Using Ternary Operator
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+" "+"is largest number");
		
		
	}

}
