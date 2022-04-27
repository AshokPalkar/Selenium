package Java_LogicalPrograms;

public class Swaping_TwoNumbers
{
	public static void main(String[] args)
	{
		int a=10,  b=20; 
		
		
		System.out.println("Before swapping values are a="+a+"& b="+b);
		//logic using third variable
		
		/*int t=a;
		a=b;
		b=t;
		System.out.println("Before swapping values are a="+a+"& b="+b);*/
		
		//logic 2--using + & - operator
		
		/*a=a+b;
		a=b;
		b=a-b;
		System.out.println("Before swapping values are a="+a+"& b="+b);
		*/
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Before swapping values are a="+a+"& b="+b);
	
	}

}
