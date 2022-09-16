package sample.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringCount {

	public static void main(String[] args) {

		String s = "Welcome@123";

		char[] ch = s.toCharArray();
		int length = ch.length;
		System.out.println("Number of characters " + length);

		// =========================================================
		// Number of Words
		String w = "Welcome to Java Class";
		String[] split = w.split(" ");
		System.out.println("\nThe number of words " + split.length);

		// =====================================================
		// to Print the Vowel Count
		char[] vow = w.toCharArray();
		int vowcount = 0;
		for (int i = 0; i < vow.length; i++) {
			char c = vow[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
					c == 'A' || c == 'E' || c == 'I' || c == 'O'|| c == 'U') {
				vowcount++;
			}
		}
		System.out.println("\nThe total Vowel Count is " + vowcount);
		// ==================================================

		// print each vowel count
		Map<Character, Integer> m = new HashMap();
		for (int i = 0; i < vow.length; i++) {
			char c = vow[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
					|| c == 'A'|| c == 'E' || c == 'I' || c == 'O'|| c == 'U') {
				if (m.containsKey(c)) {
					Integer intg = m.get(c);
					m.put(c, intg + 1);
				} else {
					m.put(c, 1);
				}
			}
		}
		System.out.println("\n" + m);

		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		// =====================================================================
		// to Print the Constant Count
		char[] con = w.toCharArray();
		int conCount = 0;
		for (int i = 0; i < vow.length; i++) {
			char c = vow[i];
			if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) {
				if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
						|| c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U')) {
					conCount++;
				}
			}
		}
		System.out.println("\nThe total Constanct Count is " + conCount);
		// ========================================================================
		// to print count of each Constant
		// print each vowel count
		Map<Character, Integer> m1 = new HashMap();
		for (int i = 0; i < vow.length; i++) {
			char c = vow[i];
			if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) {
				if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
						|| c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U')) {
					if (m1.containsKey(c)) {
						Integer intg = m1.get(c);
						m1.put(c, intg + 1);
					} else {
						m1.put(c, 1);
					}
				}
			}
		}
		System.out.println("\n" + m1);
		Set<Entry<Character, Integer>> entrySet1 = m1.entrySet();
		for (Entry<Character, Integer> entry : entrySet1) {
			System.out.println(entry);
		}
	}
}
