package codeforces_2022_10;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1385/B
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class codeforces_1385B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			HashSet<Integer> hash = new HashSet<Integer>();
			for (int i = 0; i < length * 2; i++) {
				int x = scanner.nextInt();
				if (!hash.contains(x)) {
					arr.add(x);
					hash.add(x);
				}
			}
			for (int i = 0; i < length; i++) {
				writer.write(arr.get(i) + " ");
			}
			writer.write("\n");
		}
		scanner.close();
		writer.flush();
	}

}
