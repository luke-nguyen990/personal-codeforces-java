package codeforces_2022_10;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1396/B
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class codeforces_1396B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int len = scanner.nextInt();
			int[] arr = new int[len];
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < len; i++) {
				arr[i] = scanner.nextInt();
				max = Math.max(max, arr[i]);
			}
			int sum = Arrays.stream(arr).sum();
			if(max * 2 > sum || sum % 2 == 1) {
				writer.write("T\n");
			}
			else {
				writer.write("HL\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}
