package codeforces_2022_09;
//https://codeforces.com/problemset/problem/1353/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1353A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			switch (n) {
			case 1:
				writer.write("0\n");
				break;
			case 2:
				writer.write(m + "\n");
				break;
			default:
				writer.write(2 * m + "\n");
				break;
			}
		}
		writer.flush();
		scanner.close();
	}

}
