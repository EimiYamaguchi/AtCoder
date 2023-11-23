package contest;

import java.util.Scanner;

public class D_ElectionQuickReport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		int[] A = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
		}
		//各候補者の得票数
		int[] count = new int[N];
		//現時点の当選者
		int ans = 0;
		for (int i = 0; i < M; i++) {
			count[A[i]]++;
			if (count[ans] < count[A[i]]) {
				ans = A[i];
			} else if (count[ans] == count[A[i]]) {
				ans = Math.min(ans, A[i]);
			}
			System.out.println(ans + 1);
		}

	}
}
