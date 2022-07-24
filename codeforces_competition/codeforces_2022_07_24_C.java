
/**
 * @author luke_nguyen
 *
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_2022_07_24_C {

	public static boolean checker(int[] pieces, int n, int m) {
		for (int p : pieces) {
			int max = p / n;
			if (max >= m) {
				return true;
			}
			if (max == 1) {
				continue;
			}
			if (max == 2 && m == 3) {
				continue;
			}
			m = Math.max(2, m - max);
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt();
			int[] arr = new int[k];
			for (int i = 0; i < k; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			if (checker(arr, n, m) || checker(arr, m, n)) {
				writer.write("Yes\n");
			} else {
				writer.write("No\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}
