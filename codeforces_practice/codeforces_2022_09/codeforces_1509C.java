package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1509/C
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class codeforces_1509C {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int len = scanner.nextInt();
		long[] arr = new long[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scanner.nextLong();
		}
		Arrays.sort(arr);
		long[][] DP = new long[len][len];
		for (int gap = 1; gap < len; gap++) {
			for (int r = gap; r < len; r++) {
				int l = r - gap;
				long add = arr[r] - arr[l];
				long candidate1 = DP[l + 1][r];
				long candidate2 = DP[l][r - 1];
				DP[l][r] = Math.min(candidate1, candidate2) + add;
			}
		}
		writer.write(DP[0][len-1] + "\n");
		scanner.close();
		writer.flush();
	}

}
