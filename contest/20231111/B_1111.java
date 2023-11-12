package contest;

import java.util.Scanner;

public class B_1111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] day = new int[N];
		int result = 0;
		int[] q = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		for (int i = 0; i < N; i++) {
			day[i] = sc.nextInt();
		}
		for (int i = 0; i < q.length; i++) {
			if (q[i] > N) {
				break;
			}
			for (int j = 0; j < 2; j++) {
				int d = q[i] % 10 * j * 10 + q[i] % 10;
				if (d <= day[q[i] - 1]) {
					result++;
				} else {
					break;
				}
			}
		}
		System.out.println(result);
	}
}
