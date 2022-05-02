package practise;

public class GivenNumberPrimeOrNot
{
	public static void main(String[] args) {
		int number = 25;
		boolean isPrime=true;
		for(int i=2;i<number;i++) {
			
			if(number%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println(number+ " is prime number");
		}
		else {
			System.out.println("not prime number");
		}
		
	}

}
