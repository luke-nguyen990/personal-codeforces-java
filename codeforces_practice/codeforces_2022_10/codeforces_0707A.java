package codeforces_2022_10;
//https://codeforces.com/problemset/problem/707/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_0707A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		boolean colored = false;
		String colors = "YMC";
		for (int i = 0; i < r * c; i++) {
			String s = scanner.next();
			if(colors.contains(s)) {
				colored = true;
			}
		}
		writer.write(colored ? "#Color\n" : "#Black&White\n");
		writer.flush();
		scanner.close();
	}

}

