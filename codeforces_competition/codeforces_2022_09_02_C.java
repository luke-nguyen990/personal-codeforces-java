import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class codeforces_2022_09_02_C {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numberCases = scanner.nextInt(); numberCases > 0; --numberCases) {
			int n = scanner.nextInt();
			int[] arrA = new int[n];
			int[] arrB = new int[n];
			boolean valid = true;
			for (int i = 0; i < n; i++) {
				arrA[i] = scanner.nextInt();
			}
			for (int i = 0; i < n; i++) {
				arrB[i] = scanner.nextInt();
				if (arrB[i] < arrA[i]) {
					valid = false;
				}
			}
			if (valid) {
				int minRange = arrA[n - 1] != arrB[n - 1] ? arrB[n - 1] - 1 : Integer.MIN_VALUE;
				for (int i = 0; i <= n; i++) {
					if (minRange > arrB[i % n]) {
						valid = false;
					}
					minRange = arrA[i % n] != arrB[i % n] ? arrB[i % n] - 1 : Integer.MIN_VALUE;
				}
				for (int i = 0; i <= n; i++) {
					if (arrB[i % n] > arrB[(i + 1) % n] + 1 && arrA[i % n] != arrB[i % n]) {
						valid = false;
					}
				}
			}
			writer.write(valid ? "YES\n" : "NO\n");
		}
		writer.flush();
		scanner.close();
	}

}