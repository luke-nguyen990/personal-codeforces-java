package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1520/B
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1520B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			long n = (long)scanner.nextInt();
			int ans = 0;
			for (int i = 1; i < 10; i++) {
				long j = i;
				while (j <= n) {
					ans++;
					j = j * 10 + i;
				}
			}
			writer.write(ans + "\n");
		}
		scanner.close();
		writer.flush();
	}

}
