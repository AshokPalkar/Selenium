package Java_LogicalPrograms;

public class PalindromeOrNot
{
	public static void main(String[] args) {
		palindrome(164);
	}
	public static void palindrome(int input)
	{
		int input1=input;
		int rev=0;
		while(input>0)
		{
			rev=rev*10+input%10;
			input=input/10;
		}
		if(input1==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not pal");
		}
	}
	

}
