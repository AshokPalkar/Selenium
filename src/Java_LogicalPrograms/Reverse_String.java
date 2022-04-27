package Java_LogicalPrograms;

public class Reverse_String
{
	public static void main(String[] args)
	{
		
		//logic 1 using length() & CharAt(index)
		
		String Name = "UMESH PALKAR";
		String Rev = "";
		
		int length = Name.length();
		System.out.println(length);
		for(int i=length-1; i>=0; i--)
		{
			Rev=Rev+Name.charAt(i);
		}
		System.out.print("Reversed String is: "+Rev);
		
		//By Using Character Array
		
		/*char arr[]=Name.toCharArray();
		int length = arr.length;
		
		for(int i=length-1; i>=0; i--)
		{
			Rev=Rev+arr[i];
		}
		System.out.print("Reversed String is: "+Rev);*/
		
		//By Using StringBuffer Class
		//StringBuffer sb = new StringBuffer(Name);
		//System.out.println("Reversed String is: "+sb.reverse());
		
	}

}
