package Logical;

public class ReverseString1 
{
	public static void main(String[] args) {
		String str = "poonam";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.print(rev);
		System.out.println(rev.toUpperCase());
	}

}
