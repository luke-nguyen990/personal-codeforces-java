import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;

public class codeforces_2022_10_10_B {

	public static boolean isValid(int a, int b, int c) {
		int cur = 2;
		while (cur <= a || cur <= b || cur <= c) {
			if (a % cur == 0 && c % cur == 0 && b % cur != 0) {
				return false;
			}
			if (a % cur == 0) {
				a /= cur;
			}
			if (b % cur == 0) {
				b /= cur;
			}
			if (c % cur == 0) {
				c /= cur;
			}
			if (a % cur != 0 && b % cur != 0 && c % cur != 0) {
				cur++;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numberCases = scanner.nextInt(); numberCases > 0; --numberCases) {
			int length = scanner.nextInt();
			int[] A = new int[length];
			for (int i = 0; i < length; i++) {
				A[i] = scanner.nextInt();
			}
			boolean valid = true;
			for (int i = 1; i < length - 1; i++) {
				if (!isValid(A[i - 1], A[i], A[i + 1])) {
					valid = false;
					break;
				}
			}
			writer.write(valid ? "YES\n" : "NO\n");
		}
		writer.flush();
		scanner.close();
	}

}