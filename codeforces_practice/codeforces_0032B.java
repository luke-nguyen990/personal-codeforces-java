//https://codeforces.com/problemset/problem/32/B

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_0032B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = scanner.next();
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				ans += "0";
			} else if (s.charAt(i + 1) == '.') {
				ans += "1";
				i++;
			} else {
				ans += "2";
				i++;
			}
		}
		writer.write(ans + "\n");
		writer.flush();
		scanner.close();
	}

}