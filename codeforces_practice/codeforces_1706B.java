//https://codeforces.com/contest/1706/problem/B

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_1706B {

	private static int countMax(ArrayList<Integer> indices) {
		if (indices.size() == 0) {
			return 0;
		}
		int cur = indices.get(0) % 2;
		int ans = 1;
		for (int i = 0; i < indices.size(); i++) {
			if (cur != indices.get(i) % 2) {
				ans++;
				cur ^= 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			ArrayList<ArrayList<Integer>> allIndices = new ArrayList<>();
			for(int i = 0; i < length; i++) {
				allIndices.add(new ArrayList<Integer>());
			}
			for (int i = 0; i < length; i++) {
				int color = scanner.nextInt() - 1;
				allIndices.get(color).add(i);
			}
			for (int i = 0; i < length; i++) {
				System.out.print(String.format("%d ", countMax(allIndices.get(i))));
			} System.out.println();
		}
		scanner.close();
	}

}
