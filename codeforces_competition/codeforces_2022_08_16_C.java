import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;

public class codeforces_2022_08_16_C {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), q = scanner.nextInt();
			int[] firstWin = new int[n];
			int[] lastWin = new int[n];
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			int curWinner = arr[0];
			for (int i = 1; i < n; i++) {
				curWinner = Math.max(curWinner, arr[i]);
				if (firstWin[curWinner - 1] == 0) {
					firstWin[curWinner - 1] = i;
				}
				lastWin[curWinner - 1] = i;
				if (curWinner == n) {
					break;
				}
			}
			while (q-- > 0) {
				int i = arr[scanner.nextInt() - 1], k = scanner.nextInt();
				if (firstWin[i - 1] == 0 || k < firstWin[i - 1]) {
					writer.write("0\n");
				} else if (i != n) {
					writer.write(Math.min(lastWin[i - 1] - firstWin[i - 1] +1, k - firstWin[i - 1] + 1) + "\n");
				} else {
					writer.write((k - firstWin[i - 1] + 1) + "\n");
				}
			}
		}
		writer.write("\n");
		writer.flush();
		scanner.close();
	}

}

/*
 * 
 * 1 4 1 1 2 3 4 3 2
 * 
 * 
 */