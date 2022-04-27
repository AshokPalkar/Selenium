package Logical;

public class Arm
{
	public static void main(String[] args) {
		
	
	int i=153,sum=0,rem=0,j=i;
	while(i>0)
	{
		rem=i%10;
		sum=sum+(rem*rem*rem);
		i=i/10;
		
	}
	if(j==sum)
	{
		System.out.println("arm");
	}
	else {
		System.out.println("not");
	}

}
}
