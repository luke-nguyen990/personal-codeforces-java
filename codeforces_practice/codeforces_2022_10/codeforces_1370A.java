package codeforces_2022_10;
//https://codeforces.com/problemset/problem/1370/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class codeforces_1370A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt();
			writer.write((n / 2) + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
