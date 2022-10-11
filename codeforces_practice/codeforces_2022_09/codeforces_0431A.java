package codeforces_2022_09;
//https://codeforces.com/problemset/problem/431/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_0431A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] calories = new int[4];
		for (int i = 0; i < 4; i++) {
			calories[i] = scanner.nextInt();
		}
		int ans = 0;
		for (char c : scanner.next().toCharArray()) {
			ans += calories[(int) c - (int) '1'];
		}
		writer.write(ans + "\n");
		writer.flush();
		scanner.close();
	}

}
