import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class codeforces_2022_09_02_A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			long n = scanner.nextLong();
			long ans = n + 2 * (n / 2) + 2 * (n / 3);
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}

}