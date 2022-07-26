
/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1705/problem/B
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeforces_1705B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			long ans = 0;
			boolean firstZeroes = true;
			for (int i = 0; i < length - 1; i++) {
				long x = scanner.nextInt();
				if (x == 0 && !firstZeroes) {
					ans++;
				}
				else if(x != 0) {
					firstZeroes = false;
					ans += x;
				}
			} scanner.nextInt();
			writer.write(ans + "\n");

		}
		writer.flush();
		scanner.close();
	}

}
