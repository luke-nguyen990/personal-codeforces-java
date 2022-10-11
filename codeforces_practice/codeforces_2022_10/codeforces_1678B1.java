package codeforces_2022_10;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1709/problem/E
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1678B1 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int len = scanner.nextInt();
			String s = scanner.next();
			int ans = 0;
			for (int i = 1; i < len; i += 2) {
				if (s.charAt(i) != s.charAt(i - 1)) {
					ans++;
				}
			}
			writer.write(String.format("%d\n", ans));
		}
		scanner.close();
		writer.flush();
	}
}
