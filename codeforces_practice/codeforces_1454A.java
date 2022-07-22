/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1454/A
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1454A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt();
			for(int i = 0; i < n; i++) {
				writer.write(String.valueOf((i + 1) % n + 1) + " ");
			} writer.write("\n");
		}
		scanner.close();
		writer.flush();
	}

}
