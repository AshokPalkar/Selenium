package Logical;

public class LargestOfThree 
{
	public static void main(String[] args) {
		int a=100, b=400 ,c=30;
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest);
	}
	

}
