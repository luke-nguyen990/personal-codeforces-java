
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/580/C
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_0580C {

	static int ans = 0;

	public static void dfs(ArrayList<ArrayList<Integer>> tree, int[] catByVertices, int node, int pNode, int conCats,
			int maxCats) {
		conCats = (catByVertices[node] == 0) ? 0 : conCats + 1;
		if (conCats > maxCats) {
			return;
		}
		if (tree.get(node).size() == 0 || (tree.get(node).size() == 1 && tree.get(node).get(0) == pNode)) {
			ans++;
			return;
		}
		for (int i = 0; i < tree.get(node).size(); i++) {
			int cNode = tree.get(node).get(i);
			if (cNode != pNode) {
				dfs(tree, catByVertices, cNode, node, conCats, maxCats);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int numVertices = scanner.nextInt(), maxCats = scanner.nextInt();
		int[] catByVertices = new int[numVertices];
		for (int i = 0; i < numVertices; i++) {
			catByVertices[i] = scanner.nextInt();
		}
		ArrayList<ArrayList<Integer>> tree = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < numVertices; i++) {
			tree.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < numVertices - 1; i++) {
			int u = scanner.nextInt() - 1, v = scanner.nextInt() - 1;
			tree.get(u).add(v);
			tree.get(v).add(u);
		}
		dfs(tree, catByVertices, 0, -1, 0, maxCats);
		writer.write(ans + "\n");
		writer.flush();
		scanner.close();
	}

}
