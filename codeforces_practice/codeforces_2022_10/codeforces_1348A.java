package codeforces_2022_10;
//https://codeforces.com/problemset/problem/1348/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1348A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt();
			long ans = 2;
			for (int i = 0; i < ((n / 2) - 1); i++) {
				ans += 2 * Math.pow(2, i + 1);
			}
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
