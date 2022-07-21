//https://codeforces.com/problemset/problem/1535/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1535_A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int[] arr = new int[4];
			for (int i = 0; i < 4; i++) {
				arr[i] = scanner.nextInt();
			}
			boolean can = Math.max(arr[0], arr[1]) >= Math.min(arr[2], arr[3]);
			can = can & Math.min(arr[0], arr[1]) <= Math.max(arr[2], arr[3]);
			writer.write(can ? "YES\n" : "NO\n");
		}
		writer.flush();
		scanner.close();
	}

}
