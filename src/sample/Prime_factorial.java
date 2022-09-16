package sample;

public class Prime_factorial {
	public static void main(String[] args) {

		System.out.println("check the number is prime or not");
		int i = 4;
		int count = 0;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(i + "its a prime number ");

		} else {
			System.out.println(i + " Its not a Prime number ");
		}

		System.out.println("\nprint prime numbers between 1 to 50");

		int primeCount = 0;
		int primeSum=0;
		for (int j = 1; j <= 50; j++) {
			int ans = 0;
			
			for (int j1 = 2; j1 <= j / 2; j1++) {
			
				if (j % j1 == 0) {
					ans++;
				}
				

			}
			if (ans == 0) {
				primeCount++;
				System.out.println("the prime numbers is " + j);
				primeSum=primeSum+j;
			}
			
		}
		// to find the count of prime numbers 
		System.out.println("The prime count is " + primeCount);
		// to sum the prime numbers 
		System.out.println("The prime Sum is " + primeSum);
		System.out.println("\nfind the factorial of ");

		int f = 10;
		int factorial = 1;

		while (f > 0) {
			factorial = factorial * f;// 120
			f--;//
		}
		System.out.println(factorial);

	}
}
