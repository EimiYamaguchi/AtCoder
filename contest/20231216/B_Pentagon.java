package contest;

import java.util.Arrays;
import java.util.Scanner;

public class B_Pentagon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String S = sc.next();
		final String T = sc.next();
		String[] s = { "AB", "BC", "CD", "DE", "EA", "BA", "BC", "DC", "ED", "AE" };

		if (Arrays.asList(s).contains(S) && Arrays.asList(s).contains(T)) {
			System.out.println("Yes");
		} else if (!Arrays.asList(s).contains(S) && !Arrays.asList(s).contains(T)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
