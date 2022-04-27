package Java_LogicalPrograms;

import java.util.Scanner;

public class Reverse_Any_Number {
	public static void main(String[] args)
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		int Rev = 0;

		while (num != 0) {
			Rev = Rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Revers Number is: " + Rev);*/

		// By Using StringBuffer class Reverse method
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Revers Number is: " + rev);
		
		//By Using StringBuilder class Reverse method*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("Revers Number is: " + rev);
	}

}
