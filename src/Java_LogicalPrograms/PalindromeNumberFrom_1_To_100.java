package Java_LogicalPrograms;

public class PalindromeNumberFrom_1_To_100
{
	public static void main(String[] args)
	{
		
				
		for(int i=1; i<=100 ;i++)
		{
			
			int num=i;
			int rev=0;
			while(num>0)
			{
				rev=rev*10 + num%10;
				num=num/10;
			}
		
		if(i==rev)
			
			{
				
				System.out.println("palindrome number is:" +i);
			}
			
		
	}

}
}