package interview;

public class Test
{
	public void foo()
	{
		try {
			throw new RuntimeException();
		}
		finally {
			System.out.println("in finally block");
		}
	}
	
	public static void main(String[] args) {
		try {
			Test t = new Test();
			t.foo();
			System.out.println("finished running");
		}catch (Exception e) {
			
		}
	}
	
	

}
