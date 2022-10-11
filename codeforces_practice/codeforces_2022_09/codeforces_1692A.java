package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1692/A
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1692A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int a = scanner.nextInt();
			int ans = 0;
			for (int i = 0; i < 3; i++) {
				if (scanner.nextInt() > a)
					ans++;
			}
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
