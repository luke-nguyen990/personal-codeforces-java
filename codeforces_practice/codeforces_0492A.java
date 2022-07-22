
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/492/A
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_0492A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scanner.nextInt();
		int cum = 0;
		int level = 0;
		while (n >= cum + level) {
			cum += level;
			level += 1;
			n -= cum;			
		}
		writer.write((level - 1) + "\n");
		writer.flush();
		scanner.close();
	}

}
