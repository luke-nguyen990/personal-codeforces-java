package codeforces_2022_10;
//https://codeforces.com/problemset/problem/749/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_0749A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = scanner.nextInt();
		writer.write((x / 2) + "\n");
		writer.write((x % 2 == 0 ? "2 ".repeat(x / 2) : "2 ".repeat(x / 2 - 1) + "3"));
		writer.flush();
		scanner.close();
	}

}
