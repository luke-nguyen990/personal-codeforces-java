import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class codeforces_2022_08_04_B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt();
			writer.write(n + "\n");
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = 1 + i;
				writer.write(arr[i] + " ");
			}
			writer.write("\n");
			for (int i = 0; i < n - 1; i++) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				for (int j : arr) {
					writer.write((j) + " ");
				}
				writer.write("\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}