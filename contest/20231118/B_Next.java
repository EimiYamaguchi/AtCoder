package contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class B_Next {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		Integer[] A = new Integer[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		// セットを作成
		Set<Integer> set1 = new HashSet<>();
		// 配列からセットを作成
		Collections.addAll(set1, A);
		List<Integer> list = new ArrayList<Integer>(set1);
		list.remove(Collections.max(list));
		System.out.println(Collections.max(list));
	}
}
