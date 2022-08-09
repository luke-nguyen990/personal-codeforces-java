
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1697/B
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class codeforces_1697B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scanner.nextInt(), q = scanner.nextInt();
		Long[] arr = new Long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextLong();
		}
		Arrays.sort(arr);
		for (int i = 1; i < n; i++) {
			arr[i] += arr[i - 1];
		}
		while (q-- > 0) {
			int x = scanner.nextInt(), y = scanner.nextInt();
			int l = n - 1 - x;
			int r = l  + y;
			Long ans = arr[r];
			if(l >= 0) ans -= arr[l];
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
