package contest;

import java.util.Scanner;

public class A_Tomorrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int M = sc.nextInt();
		final int D = sc.nextInt();
		final int y = sc.nextInt();
		final int m = sc.nextInt();
		final int d = sc.nextInt();
		if (d == D) {
			if (m == M) {
				System.out.println((y + 1) + " " + 1 + " " + 1);
			} else {
				System.out.println(y + " " + (m + 1) + " " + 1);
			}
		} else {
			System.out.println(y + " " + m + " " + (d + 1));
		}
	}

}
