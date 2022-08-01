import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;

public class codeforces_2022_08_01_A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), HH = scanner.nextInt(), MM = scanner.nextInt();
			int ans = 24 * 60;
			int cur = HH * 60 + MM;
			for (int i = 0; i < n; i++) {
				int hh = scanner.nextInt(), mm = scanner.nextInt();
				int temp = hh * 60 + mm;
				int diff = temp >= cur ? temp - cur : temp + 24 * 60 - cur;
				ans = Math.min(ans, diff);
			}
			writer.write(String.format("%d %d\n", ans / 60, ans % 60));
		}
		writer.flush();
		scanner.close();
	}

}
