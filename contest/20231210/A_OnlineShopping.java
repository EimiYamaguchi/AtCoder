package contest;

import java.util.Scanner;

public class A_OnlineShopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int S = sc.nextInt();
		final int K = sc.nextInt();
		int sum = 0;
		int[][] pq = new int[N][2];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a * b;
		}
		if (sum >= S) {
			System.out.println(sum);
		} else {
			System.out.println(sum + K);
		}
	}
}
