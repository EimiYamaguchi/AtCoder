package tessoku;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		for (int s = 0; s < N; s++) {
			int num = K - A[s];
			for (int t = 0; t < N; t++) {
				if (num == B[t]) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

}
