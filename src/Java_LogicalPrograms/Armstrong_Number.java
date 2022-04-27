package Java_LogicalPrograms;

import java.util.Scanner;

public class Armstrong_Number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number....");
		int num = sc.nextInt();
		int rem=0,sum=0;
		int num1=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
			
		}
		if(num1==sum)
		{
			System.out.println(num1+" " + "is Armstrong Number");
		}
		else
		{
			System.out.println(num1+" " + "is Not Armstrong Number");
		}
		
	}

}
