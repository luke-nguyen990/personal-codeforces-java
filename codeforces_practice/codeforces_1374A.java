//https://codeforces.com/problemset/problem/1374/A

import java.util.Scanner;

public class codeforces_1374A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCase = scanner.nextInt(); numCase > 0; numCase--) {
			int x = scanner.nextInt(), y = scanner.nextInt(), n = scanner.nextInt();
			System.out.println(x*(n / x) + (x*(n / x) + y > n ? y - x : y));
		}
	}

}
