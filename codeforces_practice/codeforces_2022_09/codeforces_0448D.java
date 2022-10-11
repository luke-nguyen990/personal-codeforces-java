package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/448/D
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_0448D {

	public static boolean canBeKth(long numRows, long numCols, long candidate, long kth) {
		long smallerOrEqualTotal = 0;
		for (int i = 1; i <= numRows; i++) {
			smallerOrEqualTotal += Math.min(candidate / i, numCols);
		}
		return smallerOrEqualTotal >= kth;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		long numRows = scanner.nextLong(), numCols = scanner.nextLong(), kth = scanner.nextLong();
		long l = 1, r = numRows * numCols + 1;
		while (l < r) {
			long m = (l + r) / 2;
			if (canBeKth(numRows, numCols, m, kth)) {
				r = m;
			} else {
				l = m + 1;
			}
		}
		writer.write(l + "\n");
		writer.flush();
		scanner.close();
	}

}
