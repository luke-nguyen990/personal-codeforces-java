import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;

public class codeforces_2022_08_16_A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			if (n % 2 == m % 2) {
				writer.write("Tonya\n");
			} else {
				writer.write("Burenka\n");
			}
		}
		writer.write("\n");
		writer.flush();
		scanner.close();
	}

}