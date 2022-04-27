package Java_LogicalPrograms;

public class Duplicate 
{
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,30,50,10,20,60,70,60};
		int sum=0;
		System.out.println("duplicate element are");
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				
					System.out.print(arr[i]+" ");
					sum=sum+arr[i];
					
					
					
				}
			}
			

		}
		System.out.println("sum="+ sum);
		
	}

}
