
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1398/D
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class codeforces_1398D {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] counters = new int[3];
		for (int i = 0; i < 3; i++) {
			counters[i] = scanner.nextInt();
		}
		ArrayList<ArrayList<Integer>> colors = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 3; i++) {
			ArrayList<Integer> color = new ArrayList<>();
			for (int j = 0; j < counters[i]; j++) {
				color.add(scanner.nextInt());
			}
			Collections.sort(color);
			colors.add(color);
		}
		int[][][] DP = new int[counters[0] + 1][counters[1] + 1][counters[2] + 1];
		for (int c0 = 0; c0 <= counters[0]; c0++) {
			for (int c1 = 0; c1 <= counters[1]; c1++) {
				for (int c2 = 0; c2 <= counters[2]; c2++) {
					if (c0 + 1 <= counters[0] && c1 + 1 <= counters[1]) {
						DP[c0 + 1][c1 + 1][c2] = Math.max(DP[c0 + 1][c1 + 1][c2],
								DP[c0][c1][c2] + colors.get(0).get(c0) * colors.get(1).get(c1));
					}
					if (c0 + 1 <= counters[0] && c2 + 1 <= counters[2]) {
						DP[c0 + 1][c1][c2 + 1] = Math.max(DP[c0 + 1][c1][c2 + 1],
								DP[c0][c1][c2] + colors.get(0).get(c0) * colors.get(2).get(c2));
					}
					if (c1 + 1 <= counters[1] && c2 + 1 <= counters[2]) {
						DP[c0][c1 + 1][c2 + 1] = Math.max(DP[c0][c1 + 1][c2 + 1],
								DP[c0][c1][c2] + colors.get(1).get(c1) * colors.get(2).get(c2));
					}
					if (c0 + 1 <= counters[0]) {
						DP[c0 + 1][c1][c2] = Math.max(DP[c0 + 1][c1][c2], DP[c0][c1][c2]);
					}
					if (c1 + 1 <= counters[1]) {
						DP[c0][c1 + 1][c2] = Math.max(DP[c0][c1 + 1][c2], DP[c0][c1][c2]);
					}
					if (c2 + 1 <= counters[2]) {
						DP[c0][c1][c2 + 1] = Math.max(DP[c0][c1][c2 + 1], DP[c0][c1][c2]);
					}
				}
			}
		}
		writer.write(DP[counters[0]][counters[1]][counters[2]] + "\n");
		writer.flush();
		scanner.close();
	}

}
