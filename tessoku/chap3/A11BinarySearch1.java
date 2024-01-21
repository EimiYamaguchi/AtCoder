package tessoku;

import java.util.Scanner;

public class A11BinarySearch1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int ans = search(N, A, X);
		System.out.println(ans + 1);

	}

	static int search(int N, int[] A, int x) {
		int L = 1, R = N;
		while (L <= R) {
			int M = (L + R) / 2;
			if (x < A[M])
				R = M - 1;
			if (x == A[M])
				return M;
			if (x > A[M])
				L = M + 1;
		}
		return -1; // 整数 x が存在しない場合）
	}
}
