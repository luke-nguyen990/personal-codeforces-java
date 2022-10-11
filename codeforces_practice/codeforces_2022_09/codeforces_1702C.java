package codeforces_2022_09;
//https://codeforces.com/contest/1702/problem/C

import java.util.Scanner;
import java.util.HashMap;

public class codeforces_1702C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCase = scanner.nextInt(); numCase > 0; numCase--) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			HashMap<Integer, Integer> first = new HashMap<>();
			HashMap<Integer, Integer> last = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int station = scanner.nextInt();
				if (!first.containsKey(station)) {
					first.put(station, i);
				}
				last.put(station, i);
			}
			for (int i = 0; i < k; i++) {
				int l = scanner.nextInt(), r = scanner.nextInt();
				if (!first.containsKey(l) || !last.containsKey(r)) {
					System.out.println("NO");
				} else if (first.get(l) > last.get(r)) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			}
		}
		scanner.close();
	}

}
