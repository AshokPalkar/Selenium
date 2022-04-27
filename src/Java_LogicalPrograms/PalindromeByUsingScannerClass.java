package Java_LogicalPrograms;

import java.util.Scanner;

public class PalindromeByUsingScannerClass
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int maxNumber = scan.nextInt();
		
		int num,rev;
		int count=0;
		System.out.println("Following are the palindrome numbers");
		for(int i=1; i<=maxNumber; i++)
		{
			num=i;
			rev=0;
			
			while(num>0)
			{
				rev=rev*10 + num%10;
				num=num/10;
			}
			if(i==rev)
			{
				System.out.print(i+ " ");
				count++;
				
			}
			
		}
		System.out.println();
		System.out.println("total count= "+count);
		
	}

}
