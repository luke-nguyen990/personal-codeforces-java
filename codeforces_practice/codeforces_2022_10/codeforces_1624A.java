package codeforces_2022_10;
//https://codeforces.com/problemset/problem/1624/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1624A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			int curMin = Integer.MAX_VALUE;
			int curMax = Integer.MIN_VALUE;
			while (length > 0) {
				length--;
				int x = scanner.nextInt();
				curMin = Math.min(x, curMin);
				curMax = Math.max(x, curMax);
			}
			writer.write((curMax - curMin) + "\n");
		}
		scanner.close();
		writer.flush();
	}

}
