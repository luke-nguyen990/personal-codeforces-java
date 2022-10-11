package codeforces_2022_10;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1388/C
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1388C {
	static class Pair {
		long positive;
		long negative;

		public Pair() {
		}
	}

	static boolean dfs(int parentNode, int curNode, ArrayList<ArrayList<Integer>> tree, ArrayList<Pair> pairs,
			long[] happinessInCities, long[] peopleInCities) {
		boolean ret = true;
		long positive = 0;
		long negative = 0;
		for (int i = 0; i < tree.get(curNode).size(); i++) {
			int childNode = tree.get(curNode).get(i);
			if (childNode == parentNode)
				continue;
			ret &= dfs(curNode, childNode, tree, pairs, happinessInCities, peopleInCities);			
			positive += pairs.get(childNode).positive;
			negative += pairs.get(childNode).negative;
		}
		long totalPeopleThroughCity = peopleInCities[curNode] + negative + positive;
		long finalPositive = (totalPeopleThroughCity + happinessInCities[curNode]) / 2;
		long finalNegative = totalPeopleThroughCity - finalPositive;
		if (finalPositive - finalNegative != happinessInCities[curNode] || finalPositive < 0 || finalNegative < 0) {			
			return false;
		}
		if(positive > finalPositive) {
			return false;
		}
		pairs.get(curNode).positive = finalPositive;
		pairs.get(curNode).negative = finalNegative;
		return ret;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			int cities = scanner.nextInt();
			scanner.nextInt();
			long[] peopleInCities = new long[cities];
			for (int i = 0; i < cities; i++) {
				peopleInCities[i] = scanner.nextLong();
			}
			long[] happinessInCities = new long[cities];
			for (int i = 0; i < cities; i++) {
				happinessInCities[i] = scanner.nextLong();
			}
			ArrayList<ArrayList<Integer>> tree = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < cities; i++) {
				tree.add(new ArrayList<Integer>());
			}
			for (int i = 0; i < cities - 1; i++) {
				int x = scanner.nextInt() - 1, y = scanner.nextInt() - 1;
				tree.get(x).add(y);
				tree.get(y).add(x);
			}
			ArrayList<Pair> pairsInCities = new ArrayList<Pair>();
			for (int i = 0; i < cities; i++) {
				pairsInCities.add(new Pair());
			}
			if (dfs(-1, 0, tree, pairsInCities, happinessInCities, peopleInCities)) {
				writer.write("YES\n");
			} else {
				writer.write("NO\n");
			}
		}
		writer.flush();
		scanner.close();
	}
}
