package tessoku;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ans = new int[10];

		for (int i = 0; i < 10; i++) {
			ans[i] = N % 2;
			N = N / 2;
		}
		for (int i = 9; i >= 0; i--) {
			System.out.print(ans[i]);
		}
	}

}
