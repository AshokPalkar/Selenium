package Logical;

public class palindro 
{
	public static void main(String[] args) {
		int i=121,rev=0,j=i;
		
		while(i>0)
		{
			rev=rev*10+i%10;
			i=i/10;
		}
		if(j==rev)
		{
			System.out.println("palindro");
		}
		else
		{
			System.out.println("not palin");
		}
	}

}
