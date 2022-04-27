package StarPattern;

public class Pattern10 
{
	public static void main(String[] args)
	{
		int space1=3;
		int star1=1;
		int row1=7;
		
		for(int i=1; i<=row1;i++)
		{
			for(int j=1; j<=space1; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				space1++;
			}
			else
			{
				space1--;
			}
		}
		
	}

}
