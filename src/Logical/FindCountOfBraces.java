package Logical;

public class FindCountOfBraces {

	public static void main(String[] args) {
		String str = "(())()(())()(())";
		int count = 0;
		int length = str.length();
		System.out.println(length);
		System.out.println("Total no of Braces are...");
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			count++;
		}
		
		System.out.println(count);

	}

}
