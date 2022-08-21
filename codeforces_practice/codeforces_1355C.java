
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1355/C
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1355C {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		long A = scanner.nextLong(), B = scanner.nextLong(), C = scanner.nextLong(), D = scanner.nextLong();
		long[] pre = new long[(int) Math.max(D, B + C) + 2];
		for (int i = (int) A; i <= (int) B; i++) {
			pre[(int) B + i] += 1;
			if (C + i + 1 < pre.length) {
				pre[(int) C + i + 1] -= 1;
			}
		}
		for (int i = 1; i < pre.length; i++) {
			pre[i] += pre[i - 1];
		}
		for (int i = 1; i < pre.length; i++) {
			pre[i] += pre[i - 1];
		}
		long ans = 0;
		for (int i = (int)C; i <= D; i++) {
			ans += pre[pre.length - 1] - pre[i];
		}
		writer.write(ans + "\n");
		writer.flush();
		scanner.close();
	}

}
