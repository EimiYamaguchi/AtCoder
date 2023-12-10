package contest;

import java.util.Scanner;

public class B_BuyOneCartonofMilk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		卵 6 個入りのパックは S 円、卵8 個入りのパックは M 円、卵 12 個入りのパックは L 円
		*/
		final int N = sc.nextInt();
		final int S = sc.nextInt();
		final int M = sc.nextInt();
		final int L = sc.nextInt();
		int ans = 100000000;
		//全探索
		for (int a = 0; a < 101; a++) {
			for (int b = 0; b < 101; b++) {
				for (int c = 0; c < 101; c++) {
					if (N <= (6 * a + 8 * b + 12 * c)) {
						ans = Math.min(ans, (S * a + M * b + L * c));
					}
				}
			}
		}
		System.out.println(ans);
	}

}
