
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/478/C
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_0478C {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		long[] colors = new long[3];
		for (int i = 0; i < 3; i++) {
			colors[i] = scanner.nextLong();
		}
		Arrays.sort(colors);
		if (colors[2] <= 2 * (colors[0] + colors[1])) {
			writer.write(Arrays.stream(colors).sum() / 3 + "\n");
		}
		else {
			writer.write((colors[0] + colors[1]) + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
