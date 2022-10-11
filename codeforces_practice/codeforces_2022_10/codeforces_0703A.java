package codeforces_2022_10;
//https://codeforces.com/problemset/problem/703/A

import java.util.Scanner;

public class codeforces_0703A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cur = 0;
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int m = scanner.nextInt();
			int c = scanner.nextInt();
			if (m == c) {
				continue;
			}
			cur += (m > c) ? 1 : -1;
		}
		if (cur == 0) {
			System.out.println("Friendship is magic!^^\n");
		}
		else {
			System.out.println( cur > 0 ? "Mishka" : "Chris");
		}
		scanner.close();
	}

}
