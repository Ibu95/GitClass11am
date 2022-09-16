package sample;

public class Reverse_Numbers {
	// 123456
	// 654321
	public static void main(String[] args) {
		
		int input = 141;
		int org = input;
		int reverse=0;
		
		while (input>0) {
			int i = input%10;
			reverse=(reverse*10)+i;
			input/=10;
		}
		
		System.out.println(reverse);
		// to check if the numbe is palendrom 
		if (reverse == org) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not a palindrome");
		}
		
		
		
		

	}

}
