package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1709/problem/E
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class codeforces_1713D {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt();
			int[] candidates = new int[(int) Math.pow(2, n)];
			for (int i = 0; i < (int) Math.pow(2, n); i++) {
				candidates[i] = i + 1;
			}
			while (candidates.length >= 4) {
				int[] newCandidates = new int[candidates.length / 4];
				for (int i = 3; i < candidates.length; i += 4) {
					out.println(String.format("? %d %d", candidates[i - 3], candidates[i - 1]));
				}
				out.flush();
				int[] allRes = new int[candidates.length / 4];
				for (int i = 0; i < candidates.length; i += 4) {
					allRes[i / 4] = scanner.nextInt();
				}
				int[] types = new int[candidates.length / 4];
				for (int i = 3; i < candidates.length; i += 4) {
					int res = allRes[i / 4];
					switch (res) {
					case 1:
						out.println(String.format("? %d %d", candidates[i - 3], candidates[i]));
						types[i / 4] = 0;
						break;
					case 2:
						out.println(String.format("? %d %d", candidates[i - 1], candidates[i - 2]));
						types[i / 4] = 1;
						break;
					default:
						out.println(String.format("? %d %d", candidates[i - 2], candidates[i]));
						types[i / 4] = 2;
						break;
					}
				}
				out.flush();
				for (int i = 0; i < candidates.length; i += 4) {
					allRes[i / 4] = scanner.nextInt();
				}
				for (int i = 3; i < candidates.length; i += 4) {
					switch (types[i / 4]) {
					case 0:
						newCandidates[i / 4] = allRes[i / 4] == 1 ? candidates[i - 3] : candidates[i];
						break;
					case 1:
						newCandidates[i / 4] = allRes[i / 4] == 1 ? candidates[i - 1] : candidates[i - 2];
						break;
					case 2:
						newCandidates[i / 4] = allRes[i / 4] == 1 ? candidates[i - 2] : candidates[i];
						break;
					}
				}
				candidates = newCandidates;
			}
			if (candidates.length == 1) {
				out.println(String.format("! %d", candidates[0]));
				out.flush();
			} else {
				out.println(String.format("? %d %d", candidates[0], candidates[1]));
				out.flush();
				int res = scanner.nextInt();
				out.println("! " + (res == 1 ? candidates[0] : candidates[1]));
				out.flush();
			}
		}
		scanner.close();
		writer.flush();
	}
}
