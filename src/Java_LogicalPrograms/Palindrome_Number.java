package Java_LogicalPrograms;

import java.util.Scanner;

public class Palindrome_Number
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number to check if it is palindrome Number");
		
		int num = scan.nextInt();
		int originalNumber = num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(originalNumber==rev)
		{
			System.out.println("Given Number is palindrome Number:"+rev);
		}
		else
		{
			System.out.println("Given Number is not palindrome Number:");
		}
		
	}

}
