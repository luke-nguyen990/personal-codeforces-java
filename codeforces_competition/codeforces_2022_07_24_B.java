
/**
 * @author luke_nguyen
 *
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_2022_07_24_B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			int[] arr = new int[n];
			int[] cnt = new int[n];
			ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
				graph.add(new ArrayList<Integer>());
			}

			for (int i = 0; i < m; i++) {
				int p1 = scanner.nextInt(), p2 = scanner.nextInt();
				p1--;
				p2--;
				cnt[p1]++;
				cnt[p2]++;
				graph.get(p1).add(p2);
				graph.get(p2).add(p1);
			}
			if (m % 2 == 0) {
				writer.write("0\n");
			} else {
				int min = Integer.MAX_VALUE;
				for (int p1 = 0; p1 < n; p1++) {
					if (cnt[p1] % 2 == 1) {
						min = Math.min(min, arr[p1]);
					} else {
						for (int j = 0; j < graph.get(p1).size(); j++) {
							int p2 = graph.get(p1).get(j);
							if (cnt[p2] % 2 == 0) {
								min = Math.min(min, arr[p1] + arr[p2]);
							}
						}
					}
				}
				writer.write(min + "\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}
