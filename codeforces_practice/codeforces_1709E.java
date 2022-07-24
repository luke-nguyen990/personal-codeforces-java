
/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1709/problem/E
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class codeforces_1709E {

	public static void fillXor(int[] xors, int[] as, int node, int pValue, ArrayList<ArrayList<Integer>> graph, HashSet<Integer> used) {
		pValue = as[node] ^ pValue;
		xors[node] = pValue;
		for (int i = 0; i < graph.get(node).size(); i++) {
			int child = graph.get(node).get(i);
			if(used.contains(child)) {
				continue;
			}
			used.add(child);
			fillXor(xors, as, child, pValue, graph, used);
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int numVertices = scanner.nextInt();
		int[] as = new int[numVertices];
		for (int i = 0; i < numVertices; i++) {
			as[i] = scanner.nextInt();
		}
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < numVertices; i++) {
			graph.add(new ArrayList<>());
		}
		for (int i = 0; i < numVertices - 1; i++) {
			int u = scanner.nextInt() - 1, v = scanner.nextInt() - 1;
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		writer.write(String.valueOf(graph));
		int[] xors = new int[numVertices];
		HashSet<Integer>used = new HashSet<>();
		used.add(0);
		fillXor(xors, as, 0, 0, graph, used);
		for(int x : xors) {
			writer.write(x + " ");
		}
		writer.flush();
		scanner.close();
	}

}
