package codeforces_2022_10;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1426/A
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeforces_1426A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), x = scanner.nextInt();
			int ans = n > 2 ? ((n - 2) - 1) / x + 2 : 1;
			writer.write(ans + "\n");
		}
		scanner.close();
		writer.flush();
	}

}
