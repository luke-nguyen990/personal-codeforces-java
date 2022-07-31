import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_2022_07_31_D {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int numArrs = scanner.nextInt(), len = scanner.nextInt();
			long[][] arrs = new long[numArrs][len];
			boolean can1stSpecial = true;
			for (int i = 0; i < numArrs; i++) {
				for (int j = 0; j < len; j++) {
					arrs[i][j] = scanner.nextLong();
				}
			}
		}
		writer.flush();
		scanner.close();
	}

}
