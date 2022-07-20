//https://codeforces.com/problemset/problem/1371/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1371A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int x = scanner.nextInt();
			writer.write((x + 1) / 2 + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
