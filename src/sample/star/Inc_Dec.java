package sample.star;

public class Inc_Dec {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// ===========================================================
		System.out.println("\nIncreasing triangle\n");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// ===========================================================
		System.out.println("\nDecreasing triangle\n");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// ===========================================================
		System.out.println("\nRight Side triangle increasing\n");
		// 1 decreasing with space
		// 2 increasing with *
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// ====================================================================
		System.out.println("\nRight Side triangle Decreasing \n");
		// 1. increasing with space
		// 2. decresaing with *

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		// ====================================================================
		System.out.println("\nHill/praymid patter");
		// 1. decresing with Space
		// 2. increasing with * right side
		// 3. Increasing with start Left

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// ===============================================================
		System.out.println("\n+ReverserHill/praymid patter");
		// 1. increasing space
		// 2. decreasing with * right
		// 3. decreasing with * left

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}

			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		// ==========================================================
		System.out.println("\n Diamond  patter");
		for (int i = 1; i < n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}

			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
