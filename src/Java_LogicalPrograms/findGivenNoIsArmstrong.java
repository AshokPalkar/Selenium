package Java_LogicalPrograms;

public class findGivenNoIsArmstrong 
{
	public static void main(String[] args)
	{
		int i = 1634;
		int i1=i;
		int sum=0,rem;
		
		while(i>0)
		{
			rem=i%10;
			sum=sum+(rem*rem*rem*rem);
			i=i/10;
		}
		if(i1==sum)
		{
			System.out.println("no is armstrong");
		}
		else
		{
			System.out.println("no is not arstrong");
		}
		
	}

}
