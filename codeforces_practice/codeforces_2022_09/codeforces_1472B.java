package codeforces_2022_09;
//https://codeforces.com/problemset/problem/1472/B

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1472B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			int e = 0, o = 0;
			for (int i = 0; i < length; i++) {
				if (scanner.nextInt() % 2 == 0) {
					e++;
				} else {
					o++;
				}
			}
			if (o % 2 == 1 || (o == 0 && e % 2 == 1)) {
				writer.write("NO\n");
			}
			else {
				writer.write("YES\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}
