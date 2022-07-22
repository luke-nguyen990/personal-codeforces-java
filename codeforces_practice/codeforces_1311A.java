
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1311/A
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeforces_1311A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			int a = scanner.nextInt(), b = scanner.nextInt();
			if (a == b) {
				writer.write("0\n");
			}
			else if (b > a) {
				writer.write(String.valueOf((b - a) % 2 == 1 ? 1 : 2) + "\n");
			} else {
				writer.write(String.valueOf((a - b) % 2 == 0 ? 1 : 2) + "\n");
			}
		}
		writer.flush();
		scanner.close();
	}
}
