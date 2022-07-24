
/**
 * @author luke_nguyen
 *
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_2022_07_24_A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int l = scanner.nextInt();
			for (int i = 1; i <= l; i++) {
				writer.write(String.format("%d ", (i) % l + 1));
			} writer.write("\n");
		}
		writer.flush();
		scanner.close();
	}

}
