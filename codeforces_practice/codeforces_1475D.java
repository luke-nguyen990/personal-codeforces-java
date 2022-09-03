
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class codeforces_1475D {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			int[] memories = new int[n];
			for (int i = 0; i < n; i++) {
				memories[i] = scanner.nextInt();
			}
			ArrayList<Integer> p1 = new ArrayList<Integer>();
			ArrayList<Integer> p2 = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				if (scanner.nextInt() == 1) {
					p1.add(memories[i]);
				} else {
					p2.add(memories[i]);
				}
			}
			Collections.sort(p1);
			Collections.sort(p2);
			Collections.reverse(p1);
			Collections.reverse(p2);
			int pointer1 = 0;
			int pointer2 = 0;
			long cumSum = 0;
			while (cumSum < m && pointer1 < p1.size()) {
				cumSum += p1.get(pointer1);
				pointer1++;
			}
			while (cumSum < m && pointer2 < p2.size()) {
				cumSum += p2.get(pointer2);
				pointer2++;
			}
			if (cumSum < m) {
				writer.write("-1\n");
			} else {
				int ans = pointer1 + 2 * pointer2;
				while (pointer1 > 0) {
					pointer1--;
					cumSum -= p1.get(pointer1);
					while (pointer2 < p2.size() && cumSum < m) {
						cumSum += p2.get(pointer2);
						pointer2++;
					}
					if (cumSum >= m) {
						ans = Math.min(ans, pointer1 + 2 * pointer2);
					}
				}
				writer.write(ans + "\n");
			}
		}
		writer.flush();
		scanner.close();
	}
}
