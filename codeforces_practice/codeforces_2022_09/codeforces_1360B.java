package codeforces_2022_09;
//https://codeforces.com/problemset/problem/1360/B

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class codeforces_1360B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			int[] arr = new int[length];
			for(int i = 0; i < length; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			int ans = Integer.MAX_VALUE;
			for(int i = 1; i < length; i++) {
				ans = Math.min(ans, arr[i] - arr[i - 1]);
			}
			writer.write(ans + "\n");
		}
		scanner.close();
		writer.flush();
	}

}
