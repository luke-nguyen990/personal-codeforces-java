import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;

public class codeforces_2022_08_16_B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			if (k % 4 == 2) {
				writer.write("YES\n");
				for (int i = 1; i < n; i += 2) {
					if (i % 4 == 1) {
						writer.write(String.format("%d %d\n", i + 1, i));
					} else {
						writer.write(String.format("%d %d\n", i, i + 1));
					}
				}
			} else if (k % 2 == 0) {
				writer.write("NO\n");
			} else {
				writer.write("YES\n");
				for (int i = 1; i <= n; i += 2) {
					writer.write(String.format("%d %d\n", i, i + 1));
				}
			}
		}
		writer.write("\n");
		writer.flush();
		scanner.close();
	}

}