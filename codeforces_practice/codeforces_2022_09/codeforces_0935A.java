package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/935/A
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeforces_0935A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scanner.nextInt();
		int ans = 0;
		for (int i = 1; i <= n / 2; i++) {
			if ((n - i) % i == 0) {
				ans++;
			}
		}
		writer.write(ans + "\n");
		scanner.close();
		writer.flush();
	}

}
