import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class codeforces_2022_08_20_A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			if (n + m == 2) {
				writer.write("0\n");

			} else if (n == 1) {
				writer.write(m + "\n");

			} else if (m == 1) {
				writer.write(n + "\n");

			} else {
				int ans = n + m - 2;
				int min = Math.min(n, m);
				ans += min;
				writer.write(ans + "\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}