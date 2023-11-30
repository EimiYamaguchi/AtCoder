package tessoku;

import java.util.Scanner;

public class A05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		//N は1 以上 3000 以下なので全探索で解くことができる
		for (int i = 1; i <= N; i++) {
			for (int s = 1; s <= N; s++) {
				//3枚目のカードの数
				int three = K - i - s;
				if (three > 0 && three <= N) {
					ans++;
				}
			}
		}
		System.out.println(ans);

	}

}
