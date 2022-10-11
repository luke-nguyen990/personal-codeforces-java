package codeforces_2022_10;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1696/problem/A
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1696A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases >0; --numCases) {
			long n = scanner.nextLong(), z = scanner.nextLong();
			long ans = Integer.MIN_VALUE;
			for(int i = 0; i < n; i++) {
				long x = scanner.nextLong() | z;
				ans = Math.max(ans, x);
			}
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
