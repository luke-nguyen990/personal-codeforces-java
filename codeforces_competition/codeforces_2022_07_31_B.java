import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeforces_2022_07_31_B {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), x = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			int ans = 0;
			int l = arr[0] - x, r = arr[0] + x;
			for (int i = 1; i < n; i++) {
				if (arr[i] + x < l || arr[i] - x > r) {
					ans++;
					l = arr[i] - x;
					r = arr[i] + x;
				} else {
					l = Math.max(arr[i] - x, l);
					r = Math.min(arr[i] + x, r);
				}
			}
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}
}
