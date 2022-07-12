//https://codeforces.com/problemset/problem/432/A

import java.util.Scanner;

public class codeforces_0432A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), k = scanner.nextInt();
		int eligibleNumber = 0;
		for (int i = 0; i < n; i++) {
			int cur = scanner.nextInt();
			if (cur + k <= 5) {
				eligibleNumber++;
			}
		}
		System.out.println(eligibleNumber / 3);
		scanner.close();
	}

}
