package codeforces_2022_10;
//https://codeforces.com/problemset/problem/1294/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class codeforces_1294A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			int[] arr = new int[3];
			for(int i = 0; i < 3; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			int n = scanner.nextInt();
			n -= arr[2] - arr[0];
			n -= arr[2] - arr[1];
			if( n < 0 || n % 3 != 0) {
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
