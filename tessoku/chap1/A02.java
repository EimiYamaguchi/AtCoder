package tessoku;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int X = sc.nextInt();
		for (int i = 0; i < N; i++) {
			if (X == sc.nextInt()) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

}
