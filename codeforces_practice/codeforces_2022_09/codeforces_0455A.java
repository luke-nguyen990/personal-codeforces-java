package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/455/A
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeforces_0455A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		long[] counter = new long[100001];
		int length = scanner.nextInt();
		for (int i = 0; i < length; i++) {
			int x = scanner.nextInt();
			counter[x] += x;
		}
		long[] dp = new long[100001];
		for (int i = 1; i < dp.length; i++) {
			dp[i] = counter[i];
			if (i > 0) {
				dp[i] = Math.max(dp[i], dp[i - 1]);
			}
			if (i > 1) {
				dp[i] = Math.max(dp[i], dp[i - 2] + counter[i]);
			}
			if (i > 2) {
				dp[i] = Math.max(dp[i], dp[i - 3] + counter[i]);
			}
		}
		writer.write(dp[100000] + "\n");
		writer.flush();
		scanner.close();
	}

}
