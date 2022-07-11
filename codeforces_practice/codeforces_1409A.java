//https://codeforces.com/problemset/problem/1409/A

import java.util.Scanner;
import java.lang.Math;

public class codeforces_1409A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCase = scanner.nextInt(); numCase > 0; numCase--) {
			int a = scanner.nextInt(), b = scanner.nextInt();
			int ans = Math.abs(a - b) / 10;
			if(Math.abs(a - b) % 10 != 0) {
				ans += 1;
			}
			System.out.println(ans);
		}
		scanner.close();
	}

}
