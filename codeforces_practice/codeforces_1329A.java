
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1329/A
 */

import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1329A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = scanner.nextLong(), m = scanner.nextLong();
		long[] arr = new long[(int) m];
		for (int i = 0; i < m; i++) {
			arr[i] = scanner.nextLong();
		}
		long[] postfixSum = new long[(int)m];
		postfixSum[(int) m - 1] = arr[(int) m - 1];
		for (int i = (int) m - 2; i >= 0; i--) {
			postfixSum[i] = postfixSum[i + 1] + arr[i];
		}
		long[] ans = new long[(int) m];
		boolean valid = postfixSum[0] >= n && m <= n;
		for (int i = 0; i < m; i++) {
			if (arr[i] > n - i) {
				valid = false;
				break;
			}
			ans[i] = Math.max((long)i + 1, n - postfixSum[i] + 1);
		}
		if (valid) {
			for (long a : ans) {
				writer.write(a + " ");
			}
			writer.write("\n");
		} else {
			writer.write("-1");
		}
		writer.flush();
		scanner.close();
	}

}
