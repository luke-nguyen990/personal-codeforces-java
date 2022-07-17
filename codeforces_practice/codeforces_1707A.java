//https://codeforces.com/contest/1707/my

import java.util.Scanner;

public class codeforces_1707A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), q = scanner.nextInt();
			int[] arr = new int[n];
			int[] bool = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			for (int i = n - 1, t = 0; i >= 0; --i) {
				if (arr[i] <= t) {
					bool[i] = 1;
				}
				else if(t < q) {
					t++;
					bool[i] = 1;
				}
			}
			for (int i : bool) {
				System.out.print(i);
			}
			System.out.println();
		}
		scanner.close();
	}

}
