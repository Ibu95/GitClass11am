package sample;

public class Print_Odd_Even {

	// print even number from 1 to 10
	public static void main(String[] args) {
		int evenCount = 0;
		int oddCount = 0;
		int evenSum = 0;
		int oddSum = 0;
		// to print even
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " = Is Even number");
				// to check the count of even
				evenCount++;
				// sum of even numbers
				evenSum += i;
			}
		}

		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " = Is Odd number");
				// to check the count of odd
				oddCount++;
				// sum of odd numbers
				oddSum += i;
			}
		}
		System.out.println("Even count is " + evenCount);
		System.out.println("Odd count is " + oddCount);
		System.out.println("Even Sum is " + evenSum);
		System.out.println("Odd Sum is " + oddSum);

	}

}
