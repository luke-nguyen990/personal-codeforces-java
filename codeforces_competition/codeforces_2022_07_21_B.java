
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_2022_07_21_B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scanner.nextInt(), m = scanner.nextInt();
		long[] arr = new long[n];
		long[] cum1 = new long[n];
		long[] cum2 = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextLong();
		}
		for (int i = 1; i < n; i++) {
			cum1[i] = cum1[i - 1] + Math.max(0, arr[i - 1] - arr[i]);
			cum2[n - i - 1] = cum2[n - i] + Math.max(0, arr[n - i] - arr[n - i - 1]);
		}
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt() - 1, b = scanner.nextInt() - 1;
			if (a < b) {
				writer.write((cum1[b] - cum1[a]) + "\n");
			}
			else {
				writer.write((cum2[b] - cum2[a]) + "\n");
			}
		}
		scanner.close();
		writer.flush();
	}

}
