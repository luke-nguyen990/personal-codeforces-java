package codeforces_2022_09;
//https://codeforces.com/problemset/problem/1472/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1472A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int a = scanner.nextInt(); int b = scanner.nextInt();
			int target = scanner.nextInt();
			int max = 1;
			while(a % 2 == 0 || b % 2 == 0) {
				if(a % 2 == 0) {
					max *= 2; a /= 2;
				}
				if(b % 2 == 0) {
					max *= 2; b /= 2;
				}
			}
			writer.write(target <= max ? "YES\n" : "NO\n");
		}
		writer.flush();
		scanner.close();
	}

}
