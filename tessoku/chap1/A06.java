package tessoku;

import java.util.Scanner;

public class A06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int Q = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int[][] hanni = new int[Q][2];
		for (int i = 0; i < Q; i++) {
			hanni[i][0] = sc.nextInt();
			hanni[i][1] = sc.nextInt();
		}

		//累積和
		int[] B = new int[N + 1];
		B[0] = 0;
		for (int i = 1; i <= N; i++) {
			B[i] = B[i - 1] + A[i - 1];
		}

		//答え
		for (int i = 0; i < Q; i++) {
			int ans = B[hanni[i][1]] - B[hanni[i][0] - 1];
			System.out.println(ans);
		}

	}

}
