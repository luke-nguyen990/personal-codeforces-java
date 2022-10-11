import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;


public class codeforces_2022_09_02_B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), k = scanner.nextInt(), r = scanner.nextInt() - 1, c = scanner.nextInt() - 1;
			char[][] board = new char[n][n];
			board[r][c] = 'X';
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int a = (i % k) <= (r % k) ? (r % k) - (i % k) : (k + (r % k)) - (i % k);
					int b = (j % k) <= (c % k) ? (c % k) - (j % k) : (k + (c % k)) - (j % k);
					if (i % k == r % k && j % k == c % k) {
						board[i][j] = 'X';
					} else if (a == b) {
						board[i][j] = 'X';
					} else {
						board[i][j] = '.';
					}
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					writer.write(board[i][j]);
				}
				writer.write("\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}