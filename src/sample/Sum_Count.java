package sample;

public class Sum_Count {
	
	
	public static void main(String[] args) {
		
		int a = 1234;
		int sum=0;
		//count the number of digits 
		int count =0; 
		
		while (a>0) {
			int i = a%10;
			count++;
			// to sum the numbers 
			sum = sum +i;
			a/=10;
	
		}
		
		System.out.println("the digits is "+ count);
		
		System.out.println("The sum is "+ sum);
		
	}

}
