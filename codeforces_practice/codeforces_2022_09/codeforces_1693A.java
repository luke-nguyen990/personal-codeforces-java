package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1693/problem/A
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1693A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int len = scanner.nextInt();
			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = scanner.nextInt();
			}
			boolean ans = true;
			int cumSum = 0;
			for (int i = 0; i < len; i++) {
				cumSum += arr[i];
				if (cumSum < 0)
					ans = false;
			}
			cumSum = 0;
			for (int i = len - 1; i >= 0; i--) {
				cumSum += arr[i];
				if(cumSum > 0) {
					ans = false;
				}
			}
			writer.write(ans && cumSum == 0 ? "YES\n" : "NO\n");
		}
		writer.flush();
		scanner.close();
	}

}
