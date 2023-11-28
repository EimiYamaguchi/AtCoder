package contest;

import java.util.Scanner;

public class A_Spread {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArray = str.split("");
		String result = String.join(" ", strArray);
		System.out.println(result);
	}
}
