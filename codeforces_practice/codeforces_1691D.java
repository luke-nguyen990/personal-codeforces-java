
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1691/D
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1691D {

	public static boolean verify(long[] arr) {
		long cumSum = 0;
		int l = 0, r = 0;
		while (r < arr.length) {
			cumSum += arr[r];
			System.out.println(String.format("%d %d %d", l, r, cumSum));
			if (cumSum > Math.max(arr[l], arr[r])) {
				return false;
			}
			if(arr[r] > arr[l]) {
				cumSum = arr[r];
				l = r;
			}
			r++;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			int length = scanner.nextInt();
			long[] arr = new long[length];
			boolean valid = true;
			for (int i = 0; i < length; i++) {
				arr[i] = scanner.nextLong();
				if(i > 0 && Math.min(arr[i], arr[i-1]) > 0) {
					valid = false;
				}
			}
			
			if (!verify(arr)) {
				valid = false;
			}
			for (int i = 0; i < length / 2; i++) {
				long temp = arr[i];
				arr[i] = arr[length - 1 - i];
				arr[length - 1 - i] = temp;
			}
			if (!verify(arr)) {
				valid = false;
			}
			writer.write(valid ? "YES\n" : "NO\n");
		}
		scanner.close();
		writer.flush();
	}

}
