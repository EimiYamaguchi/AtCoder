package contest;

import java.util.Scanner;

public class B_GlassandMug {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int K = sc.nextInt();
		final int G = sc.nextInt();
		final int M = sc.nextInt();
		int g = 0;
		int m = 0;
		for (int i = 0; i < K; i++) {
			if (g == G) {
				g = 0;
			} else if (m == 0) {
				m = M;
			} else {
				if ((G - g) <= m) {
					m = m - (G - g);
					g = G;
				} else {
					g = g + m;
					m = 0;
				}
			}
		}
		System.out.println(g + " " + m);
	}
}
