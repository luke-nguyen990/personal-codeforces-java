package codeforces_2022_10;
//https://codeforces.com/problemset/problem/1367/B

import java.util.Scanner;

public class codeforces_1367B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt();
			int bO = 0, bE = 0;
			for (int i = 0; i < n; i++) {
				if (scanner.nextInt() % 2 != i % 2) {
					if (i % 2 == 0) {
						bE++;
					} else {
						bO++;
					}
				}
			}
			System.out.println(bO != bE ? -1 : bO);
		}
		scanner.close();
	}

}
