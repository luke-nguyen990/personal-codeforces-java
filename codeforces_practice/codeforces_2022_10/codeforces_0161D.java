package codeforces_2022_10;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/161/D
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;

public class codeforces_0161D {
	static long totalPairs = 0;

	public static void DP(ArrayList<ArrayList<Integer>> tree, int[][] DP, int node, int pNode, int distance) {
		DP[node][0] = 1;
		for (int i = 0; i < tree.get(node).size(); i++) {
			int cNode = tree.get(node).get(i);
			if (cNode != pNode) {
				DP(tree, DP, cNode, node, distance);
				for (int j = 0; j < distance; j++) {
					DP[node][j + 1] += DP[cNode][j];
				}
			}
		}
	}

	public static void count(ArrayList<ArrayList<Integer>> tree, int[][] DP, int node, int pNode, int distance) {
		totalPairs += DP[node][distance] * 2;
		for (int i = 0; i < tree.get(node).size(); i++) {
			int cNode = tree.get(node).get(i);
			if (cNode != pNode) {
				count(tree, DP, cNode, node, distance);
				for (int j = 0; j < distance - 1; j++) {
					if (DP[cNode][j] > 0) {
						totalPairs += DP[cNode][j]
								* Math.max(0, (DP[node][distance - 1 - j] - DP[cNode][distance - 2 - j]));
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scanner.nextInt(), k = scanner.nextInt();
		ArrayList<ArrayList<Integer>> tree = new ArrayList<ArrayList<Integer>>();
		int[][] DP = new int[n][k + 1];
		for (int i = 0; i < n; i++) {
			tree.add(new ArrayList<Integer>());
		}
		for (int i = 1; i < n; i++) {
			int u = scanner.nextInt() - 1, v = scanner.nextInt() - 1;
			tree.get(u).add(v);
			tree.get(v).add(u);
		}
		DP(tree, DP, 0, -1, k);
		count(tree, DP, 0, -1, k);
		writer.write((totalPairs / 2) + "\n");
		writer.flush();
		scanner.close();
	}

}