package facebook_hacker_cup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class facebook_2022_08_27_B2 {

	public static void checkDead(int i, int j, char[][] board) {
		if (board[i][j] != '.')
			return;
		int count = 0;
		if (i > 0 && board[i - 1][j] != '#' && board[i - 1][j] != '_')
			count++;
		if (i < board.length - 1 && board[i + 1][j] != '#' && board[i + 1][j] != '#')
			count++;
		if (j > 0 && board[i][j - 1] != '#' && board[i][j - 1] != '#')
			count++;
		if (j < board[0].length - 1 && board[i][j + 1] != '#' && board[i][j + 1] != '#') {
			count++;
		}
		if (count < 2) {
			board[i][j] = '_';
			if (i > 0)
				checkDead(i - 1, j, board);
			if (j > 0)
				checkDead(i, j - 1, board);
			if (i + 1 < board.length)
				checkDead(i + 1, j, board);
			if (j + 1 < board[0].length)
				checkDead(i, j + 1, board);
		}
	}

	public static boolean isAlive(int i, int j, char[][] board) {
		int count = 0;
		if (i > 0 && board[i - 1][j] == '^')
			count++;
		if (j > 0 && board[i][j - 1] == '^')
			count++;
		if (i + 1 < board.length && board[i + 1][j] == '^')
			count++;
		if (j + 1 < board[0].length && board[i][j + 1] == '^')
			count++;
		return count > 1;

	}

	public static void main(String[] args) throws Exception {
		String dir = System.getProperty("user.dir");
		File input = new File(dir + "/" + "facebook_2022_08_27_B2.in");
		File output = new File(dir + "/" + "facebook_2022_08_27_B2.out");
		BufferedReader reader = new BufferedReader(new FileReader(input));
		BufferedWriter writer = new BufferedWriter(new FileWriter(output));
		int numCases = Integer.parseInt(reader.readLine());
		for (int curCase = 1; curCase <= numCases; curCase++) {
			String[] RC = reader.readLine().split("\\s+");
			int r = Integer.parseInt(RC[0]);
			int c = Integer.parseInt(RC[1]);
			char[][] board = new char[r][c];
			boolean possible = true;
			for (int i = 0; i < r; i++) {
				String row = reader.readLine();
				for (int j = 0; j < row.length(); j++) {
					board[i][j] = row.charAt(j);
				}
			}
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					checkDead(i, j, board);
				}
			}
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (board[i][j] == '.')
						board[i][j] = '^';
				}
			}
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (board[i][j] == '^' && !isAlive(i, j, board))
						possible = false;
				}
			}
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (board[i][j] == '.')
						board[i][j] = '^';
					if(board[i][j] == '_') board[i][j] = '.';
				}
			}
			if (!possible) {
				writer.write(String.format("Case #%d: Impossible\n", curCase));
			} else {
				writer.write(String.format("Case #%d: Possible\n", curCase));
				for (int i = 0; i < r; i++) {
					writer.write(String.valueOf(board[i]) + "\n");
				}
			}
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
