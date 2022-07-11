//https://codeforces.com/problemset/problem/1367/A

import java.util.Scanner;

public class codeforces_1367A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCase = scanner.nextInt(); numCase > 0; numCase--) {
			String b = scanner.next();
			String a = String.valueOf(b.charAt(0));
			for (int i = 1; i < b.length() - 1; i++) {
				if (i % 2 == 1) {
					a += String.valueOf(b.charAt(i));
				}
			}
			a += String.valueOf(b.charAt(b.length() - 1));
			System.out.println(a);
		}
		scanner.close();
	}

}
