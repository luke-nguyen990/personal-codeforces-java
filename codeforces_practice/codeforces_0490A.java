//https://codeforces.com/problemset/problem/490/A

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_0490A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		List<List<Integer>> counters = new ArrayList<List<Integer>>();
		for (int i = 0; i < 3; i++) {
			counters.add(new ArrayList<Integer>());
		}
		int[] lengths = new int[3];
		for (int i = 1; i <= length; i++) {
			int cur = scanner.nextInt();
			counters.get(cur - 1).add(i);
			lengths[cur - 1] = counters.get(cur - 1).size();
		}
		Arrays.sort(lengths);
		System.out.println(lengths[0]);
		for (int i = 0; i < lengths[0]; i++) {
			System.out.println(
					String.format("%d %d %d", counters.get(0).get(i), counters.get(1).get(i), counters.get(2).get(i)));
		}
		scanner.close();
	}

}
