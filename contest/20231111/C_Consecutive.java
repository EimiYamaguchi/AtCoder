package contest;

import java.util.Scanner;

public class C_Consecutive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int Q = sc.nextInt();
		String str = sc.next();
		int[][] hanni = new int[Q][2];
		for (int i = 0; i < Q; i++) {
			hanni[i][0] = sc.nextInt() - 1;
			hanni[i][1] = sc.nextInt() - 1;
		}

		//入力文字列を数値に変換したい
		int[] A = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				A[i] = 1;
			} else {
				A[i] = 0;
			}
		}

		//Aの累積和Bを求める
		int[] B = new int[N];
		B[0] = 0;
		for (int i = 1; i < N; i++) {
			B[i] = B[i - 1] + A[i - 1];
		}

		//Qごとに答えを求める
		//l~rのAの合計
		//l~(r-1)
		//つまりB[r-1]-B[l-1]
		for (int i = 0; i < Q; i++) {
			int ans = B[hanni[i][1]] - B[hanni[i][0]];
			System.out.println(ans);
		}

	}
}
