package codeforces_2022_09;
//https://codeforces.com/problemset/problem/1551/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1551A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int x = scanner.nextInt();
			int a = x / 3, b = x / 3;
			writer.write(String.valueOf(a + (x % 3 == 1 ? 1 : 0)) + " ");
			writer.write(String.valueOf(b + (x % 3 == 2 ? 1 : 0)) + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
