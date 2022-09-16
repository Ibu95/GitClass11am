package sample;

public class Swaping {
	// A value is 10
	// B value is 5
	public static void main(String[] args) {

		// with third Variable
		int a = 5, b = 10;
		int t = b;// t=10
		b = a;// b=5
		a = t;// a=10
		System.out.println("A value is " + a);
		System.out.println("B value is " + b);

		// without third variable
		int c = 20, d = 30;
		c = c + d;// 20+30
		d = c - d;// 50-30
		c = c - d;// 50-20

		System.out.println("C value is " + c);// 30
		System.out.println("D value is " + d);// 20

	}
}
