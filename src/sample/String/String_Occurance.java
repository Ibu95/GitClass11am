package sample.String;

public class String_Occurance {
	public static void main(String[] args) {
		// Find the Upper,lower,numeric and Special with special methods
		String s = "Shivin12343@TechnoLogies.com";
		int lower = 0, upper = 0, digit = 0, spl = 0;
		String l = "", u = "", d = "", sp = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (Character.isLowerCase(a)) {
				lower++;
				l=l+a;
			} else if (Character.isUpperCase(a)) {
				upper++;
				u=u+a;
			} else if (Character.isDigit(a)) {
				digit++;
				d=d+a;
			} else {
				spl++;
				sp=sp+a;
			}
		}
		System.out.println("Total Lower Case is " + lower);
		System.out.println("The Lower Case are "+l);
		System.out.println("\nTotal Upper Case is " + upper);
		System.out.println("The Upper Case are "+ u);
		System.out.println("\nTotal Digit is " + digit);
		System.out.println("The Digits are "+ d);
		System.out.println("\nTotal Special Char is " + spl);
		System.out.println("The Special; Char are "+sp );
	
//	=======================================================================
		// Find the Upper,lower,numeric and Special without special methods
				int lower1 = 0, upper1 = 0, digit1 = 0, spl1 = 0;
				String l1 = "", u1 = "", d1 = "", sp1 = "";
				for (int i = 0; i < s.length(); i++) {
					char a = s.charAt(i);
					if (a>=97 && a<=122 ) {
						lower1++;
						l1=l1+a;
					} else if (a>=65 && a<=90) {
						upper1++;
						u1=u1+a;
					} else if (a>=48 && a<=57) {
						digit1++;
						d1=d1+a;
					} else {
						spl1++;
						sp1=sp1+a;
					}
				}
				System.out.println("\nWithout Special Methods");
				System.out.println("Total Lower Case is " + lower1);
				System.out.println("The Lower Case are "+l1);
				System.out.println("\nTotal Upper Case is " + upper1);
				System.out.println("The Upper Case are "+ u1);
				System.out.println("\nTotal Digit is " + digit1);
				System.out.println("The Digits are "+ d1);
				System.out.println("\nTotal Special Char is " + spl1);
				System.out.println("The Special; Char are "+sp1);
			
	}

}
