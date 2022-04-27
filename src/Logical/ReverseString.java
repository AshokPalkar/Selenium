package Logical;

public class ReverseString
{
	public static void main(String[] args) {
		String str = "Ashok Palkar is my name";
		String[] arr = str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			String s1=arr[i];
			arr[i] = reverseString(s1);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	
	public static String reverseString(String input)
	{
		String rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		return rev;
	}

}
