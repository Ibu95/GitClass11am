package sample.String;

public class ArrayOrderProg {
	public static void main(String[] args) {

		int[] a = { 30, 40, 10, 20, 50 };
		// 10,20,30,40,50
		// ascending
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tem = a[i];
					a[i] = a[j];
					a[j] = tem;
				}
			}
		}
		System.out.println(" min number " + a[a.length - 1]);
		System.out.println(" max number " + a[a.length - 1]);
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("Decending");
		int[] a1 = { 30, 40, 10, 20, 50 };
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
//					without third variable
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
