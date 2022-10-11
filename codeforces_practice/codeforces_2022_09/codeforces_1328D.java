package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1328/D
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeforces_1328D {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			int[] figures = new int[length];
			for (int i = 0; i < length; i++) {
				figures[i] = scanner.nextInt();
			}
			int hasEqual = -1;
			boolean hasDiff = false;
			for (int i = 0; i < length; i++) {
				if (figures[i] == figures[(i + 1) % length]) {
					hasEqual = i;
				} else {
					hasDiff = true;
				}
			}
			if (!hasDiff) {
				writer.write("1\n" + "1 ".repeat(length) + "\n");
			} else if (length % 2 == 0) {
				writer.write("2\n");
				for (int i = 0; i < length; i++) {
					writer.write(String.valueOf(i % 2 + 1) + " ");
				}
				writer.write("\n");
			} else if (hasEqual != -1) {
				writer.write("2\n");
				for (int i = 0; i <= hasEqual; i++) {
					writer.write(String.valueOf((i % 2 + 1)) + " ");
				}
				for (int i = hasEqual + 1; i < length; i++) {
					writer.write(String.valueOf(((i + 1) % 2 + 1)) + " ");
				}writer.write("\n");
			} else {
				writer.write("3\n3 ");
				for (int i = 1; i < length; i++) {
					writer.write(String.valueOf(i % 2 + 1) + " ");
				}
				writer.write("\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}
