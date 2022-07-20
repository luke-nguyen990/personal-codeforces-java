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
		scanner.nextInt();
		boolean colored = false;
		for (int i = 0; i < r; i++) {
			String s = scanner.next();
			if (s.contains("Y") || s.contains("M") || s.contains("C")) {
				colored = true;
			}
		}
		writer.write(colored ? "#Color\n" : "#Black&White\n");
		writer.flush();
		scanner.close();
	}

}
