package codeforces_2022_10;
//https://codeforces.com/problemset/problem/1433/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class codeforces_1433A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int lastNumber = scanner.nextInt();
			int cur = 1;
			int ans = String.valueOf(lastNumber).length();
			while (cur != lastNumber) {
				ans += String.valueOf(cur).length();
				cur = cur * 10 + cur % 10;
				if (cur > 10000) {
					cur = cur / 10000 + 1;
				}
			}
			writer.write(ans + "\n");
		}
		scanner.close();
		writer.flush();
	}

}
