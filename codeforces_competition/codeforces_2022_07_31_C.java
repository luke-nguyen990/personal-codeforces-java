import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

public class codeforces_2022_07_31_C {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			int[] arr = new int[m];
			for (int i = 0; i < m; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			int[] segments = new int[m];
			segments[0] = arr[0] - 1 + n - arr[m - 1];
			for (int i = 1; i < m; i++) {
				segments[i] = arr[i] - arr[i - 1] - 1;
			}
			Arrays.sort(segments);
			long numSaved = 0;
			long numIters = 0;
			for (int i = m - 1; i >= 0; i--) {
				segments[i] -= numIters * 2;
				if (segments[i] <= 0) {
					break;
				}
				if (segments[i] == 1 || segments[i] == 2) {
					numSaved++;
					numIters++;
					continue;					
				} else {
					numSaved += segments[i] - 1;
					numIters += 2;
				}
			}
			writer.write((n - numSaved) + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
