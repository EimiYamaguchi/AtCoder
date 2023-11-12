package contest;

import java.util.Scanner;

public class A_NotTooHard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int X = sc.nextInt();
		int result = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x <= X) {
				result += x;
			}
		}
		System.out.println(result);
	}
}
