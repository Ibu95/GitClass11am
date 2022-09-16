package sample.String;

public class A {

	public static void main(String[] args) {
		// how to save collection of data in single variable
		// Array
		// Declarion of 2D Array
		// datatype var[] = new datatype [length];
		int a[][] = new int[2][2];

		a[0][0] = 40;
		a[0][1] = 20;
		a[1][0] = 60;
		a[1][1] = 10;

		System.out.println(a[1][0]);

		System.out.println();
		// nested for loop
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println();
		for (int[] is : a) {
			for (int i : is) {
				System.out.println(i);
			}
		}

		int b [][][]=new int[1][1][1];
		
		for (int[][] is : b) {
			for (int[] is2 : is) {
				for (int i : is2) {
					
				}
			}
		}
		
	}

}
