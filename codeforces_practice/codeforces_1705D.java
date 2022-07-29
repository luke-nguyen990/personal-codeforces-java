
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1705/D
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;

public class codeforces_1705D {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			String s = scanner.next();
			String t = scanner.next();
			if (s.charAt(0) != t.charAt(0) || s.charAt(length - 1) != t.charAt(length - 1)) {
				writer.write("-1\n");
			} else {
				ArrayList<Character> type1 = new ArrayList<Character>();
				ArrayList<Character> type2 = new ArrayList<Character>();
				ArrayList<Integer> index1 = new ArrayList<Integer>();
				ArrayList<Integer> index2 = new ArrayList<Integer>();
				for (int i = 1; i < length; i++) {
					if (s.charAt(i) != s.charAt(i - 1)) {
						type1.add(s.charAt(i));
						index1.add(i);
					}
					if (t.charAt(i) != t.charAt(i - 1)) {
						type2.add(t.charAt(i));
						index2.add(i);
					}
				}
				if (type1.size() != type2.size()) {
					writer.write("-1\n");
				} else {
					long ans = 0;
					for (int i = 0; i < type1.size(); i++) {
						if (type1.get(i) != type2.get(i)) {
							ans = -1;
							break;
						}
						ans += Math.abs(index1.get(i) - index2.get(i));
					}
					writer.write(ans + "\n");
				}
			}
		}
		scanner.close();
		writer.flush();
	}

}
