package Logical;

public class Palindrome1To100 
{
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			int num=i;
			int rev=0; 
			
			while(num>0)
			{
				rev=rev*10+num%10;
				num=num/10;
			}
			if(i==rev)
			{
				System.out.println(i+" ");
			}
	}
	
	
	}

}
