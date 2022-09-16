package sample.String;

public class String_Reverse {
	public static void main(String[] args) {
		// reverse the word within the sentence
		String s = "Welcome to java class";
		// emocleW ot avaJ ssalC;
		String f = "";
		String[] split = s.split(" ");
		for (String each : split) {
			String ans = "";
			for (int i = each.length() - 1; i >= 0; i--) {
				char charAt = each.charAt(i);
				ans = ans + charAt;
			}
			f = f + ans + " ";
		}
		System.out.println(f);
		// ==============================================================
		// Make the sentence in pascal notation

		String pascal = "";
		String[] split1 = s.split(" ");
		for (String each : split1) {
			char charAt = each.charAt(0);
			char upperCase = Character.toUpperCase(charAt);
			String substring = each.substring(1);
			pascal = pascal + upperCase + substring + " ";

		}
		System.out.println("\n" + pascal);
		
		
		System.out.println("hi"+100+100);
	}

}
