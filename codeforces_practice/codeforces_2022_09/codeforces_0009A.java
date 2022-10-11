package codeforces_2022_09;
//https://codeforces.com/problemset/problem/9/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_0009A {

	static int gcd(int a, int b) {
		if (Math.min(a, b) == 0) {
			return Math.max(a, b);
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = 7 - Math.max(scanner.nextInt(), scanner.nextInt());
		writer.write(String.valueOf(max / gcd(max, 6) + "/" + String.valueOf(6 / gcd(max, 6))));
		writer.flush();
		scanner.close();
	}

}
