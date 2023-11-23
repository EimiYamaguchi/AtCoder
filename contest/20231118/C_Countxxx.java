package contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C_Countxxx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		String str = sc.next();
		if (N == 1) {
			System.out.println(1);
			return;
		}
		ArrayList<String> list = new ArrayList<>();
		int start = 0;
		int end = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				end = i;
				if (i == str.length() - 1) {
					list.add(str.substring(start, end + 1));
				}
			} else {
				list.add(str.substring(start, end + 1));
				start = i;
				end = i;
			}
		}
		//出現する文字の集合
		String[] strArray = str.split("");
		Set<String> set1 = new HashSet<>();
		Collections.addAll(set1, strArray);
		Map<String, Integer> map = new HashMap<>();
		for (String s : set1) {
			map.put(s, 0);
		}
		for (int i = 0; i < list.size(); i++) {
			String s = String.valueOf(list.get(i).charAt(0));
			if (map.get(s) < list.get(i).length()) {
				map.replace(s, list.get(i).length());
			}
		}
		int sum = 0;
		for (int value : map.values()) {
			sum += value;
		}

		System.out.println(sum);

	}
}
