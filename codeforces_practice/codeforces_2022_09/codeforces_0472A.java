package codeforces_2022_09;
//https://codeforces.com/problemset/problem/472/A

import java.util.Scanner;

public class codeforces_0472A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch (n % 3) {
		case 0:
			System.out.println(String.format("%d %d", 6, n - 6));
			break;
		case 1:
			System.out.println(String.format("%d %d", 4, n - 4));
			break;
		case 2:
			System.out.println(String.format("%d %d", 8, n - 8));
			break;
		}
		scanner.close();
	}

}
