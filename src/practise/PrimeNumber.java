package practise;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number....");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			boolean isPrime = true;

			if (i > 1) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
					}
				}
			} else {
				isPrime = false;
			}
			if (isPrime) {
				System.out.println("prime number: " + i);
			}
		}
	}
}
