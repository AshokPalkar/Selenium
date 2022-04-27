package Java_LogicalPrograms;

public class Vowels
{
	public static void main(String[] args)
	{
		String str ="welcome";
		
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
			{
				
				System.out.print(ch+"  ");
				
			}
			
		}
		
	}

}
