
/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1709/problem/E
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class codeforces_1709E {

	static int ans = 0;

	public static void fillCumXors(int[] cumXors, int[] nodesValue, int node, int pNode,
			ArrayList<ArrayList<Integer>> tree) {
		cumXors[node] = nodesValue[node];
		if (pNode != -1) {
			cumXors[node] ^= cumXors[pNode];
		}
		for (int i = 0; i < tree.get(node).size(); i++) {
			int cNode = tree.get(node).get(i);
			if (cNode != pNode) {
				fillCumXors(cumXors, nodesValue, cNode, node, tree);
			}
		}
	}

	public static boolean mergeSets(HashSet<Integer> bSet, HashSet<Integer> sSet, int pValue) {
		boolean hasBadPath = false;
		for (Integer sI : sSet) {			
				hasBadPath |= bSet.contains(sI ^ pValue);			
		}
		for (Integer sI : sSet) {
			bSet.add(sI);
		}
		sSet.clear();
		return hasBadPath;
	}

	public static HashSet<Integer> count(int node, int pNode, int[] cumXors, ArrayList<ArrayList<Integer>> tree,
			int[] nodesValue) {
		HashSet<Integer> pSet = new HashSet<Integer>();
		boolean hasBadPath = false;
		pSet.add(cumXors[node]);
		for (int i = 0; i < tree.get(node).size(); i++) {
			int cNode = tree.get(node).get(i);
			if (cNode != pNode) {
				HashSet<Integer> cSet = count(cNode, node, cumXors, tree, nodesValue);
				if (cSet.size() > pSet.size()) {
					hasBadPath |= mergeSets(cSet, pSet, nodesValue[node]);
					pSet = cSet;
				} else {
					hasBadPath |= mergeSets(pSet, cSet, nodesValue[node]);
				}
			}
		}
		if (hasBadPath) {
			ans++;
			return new HashSet<Integer>();
		}
		return pSet;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int numVertices = scanner.nextInt();
		int[] nodesValue = new int[numVertices];
		for (int i = 0; i < numVertices; i++) {
			nodesValue[i] = scanner.nextInt();
		}
		ArrayList<ArrayList<Integer>> tree = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < numVertices; i++) {
			tree.add(new ArrayList<>());
		}
		for (int i = 0; i < numVertices - 1; i++) {
			int u = scanner.nextInt() - 1, v = scanner.nextInt() - 1;
			tree.get(u).add(v);
			tree.get(v).add(u);
		}
		int[] cumXors = new int[numVertices];
		fillCumXors(cumXors, nodesValue, 0, -1, tree);
		count(0, -1, cumXors, tree, nodesValue);
		writer.write(ans + "\n");
		writer.flush();
		scanner.close();
	}

}
