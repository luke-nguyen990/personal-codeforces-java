package codeforces_2022_09;
//https://codeforces.com/problemset/problem/1343/B

import java.util.Scanner;

public class codeforces_1343B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			int n = scanner.nextInt();
			if (n % 4 != 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
				for (int i = 0; i < n / 2; i++) {
					System.out.print(String.format("%d ", (i * 2 + 2)));
				}
				for (int i = 0; i < n / 2 - 1; i++) {
					System.out.print(String.format("%d ", (i * 2 + 1)));					
				}
				System.out.println(String.valueOf((n / 2 - 1) + (n - 1) + 1));
			}
		}
		scanner.close();
	}

}
