package codeforces_2022_10;
//https://codeforces.com/contest/1706/problem/B

import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class codeforces_1706B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			int[] ans = new int[length];
			int[] parities = new int[length];
			Arrays.fill(parities, -1);
			for (int i = 0; i < length; i++) {
				int color = scanner.nextInt() - 1;
				if (parities[color] == -1 || parities[color] != i % 2) {
					ans[color]++;
				}
				parities[color] = i % 2;
			}
			for(int i = 0; i < length; i++) {
				writer.write(ans[i] + " ");
			} writer.write("\n");
		}
		scanner.close();
		writer.flush();
	}

}
